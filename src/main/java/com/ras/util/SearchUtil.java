package com.ras.util;

import com.ras.dao.SearchWordDao;
import org.springframework.stereotype.Service;

import java.util.stream.IntStream;

@Service
public class SearchUtil {
    // 초성이 될 수 있는 자음 목록
    private char[] initialList = {
            'ㄱ', 'ㄲ', 'ㄴ', 'ㄷ', 'ㄸ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅃ', 'ㅅ',
            'ㅆ', 'ㅇ', 'ㅈ', 'ㅉ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ'
    };

    /**
     * 중성에 ㅣ, 종성에 ㅎ 붙여서 범위 검색하는 방법으로 한글 단어검색 구현.
     * 마지막 글자가 한글인 경우 아래 설명 적용. (숫자, 영어일 경우 무시)
     *
     * ㄱ 검색 -> 가 ~ 깋
     * 고 검색 -> 고 ~ 곻
     * 공 검색 -> 공 ~ 공
     * 공1a 검색 -> 공1a ~ 공1a
     * 공ㄱ 검색 -> 공가 ~ 공깋
     * @param word
     * @return
     */
    public SearchWordDao setSearchWord(String word) {
        SearchWordDao searchWord = new SearchWordDao();

        // 마지막 글자가 한글인지 그 외(영어, 숫자, 특수문자)인지 판단
        char last = word.charAt(word.length()-1);
        if(Character.getType(last) == 5) {
            // 마지막 문자가 한글인 경우
            String startWord;
            String endWord;

            char startChar = convertStartChar(last);
            char endChar = convertEndChar(last);

            String s = word.substring(0, word.length()-1);
            startWord = s + startChar;
            endWord = s + endChar;

            searchWord.setStartWord(startWord);
            searchWord.setEndWord(endWord);
        } else {
            // 마지막 문자가 한글이 아닌 경우
            searchWord.setStartWord(word);
            searchWord.setEndWord(word);
        }
        return searchWord;
    }

    /**
     * 초성만 있을 경우 변환
     * ㄱ -> 가
     *
     * 초성+중성 / 초성+중성+종성은 그대로 반환
     * @param lastWord
     * @return
     */
    private char convertStartChar(char lastWord) {
        char returnWord;

        int idx = IntStream.range(0, initialList.length)
                .filter(i->lastWord == initialList[i]).findFirst().orElse(-1);

        if(idx >= 0) {
            // 초성만 있을 경우
            returnWord = (char) (0xAC00 + idx*588);
        } else {
            returnWord = lastWord;
        }

        return returnWord;
    }

    /**
     * 초성만 / 초성+중성 일 경우 변환
     * ㄱ -> 깋
     * 고 -> 곻
     *
     * 초성+중성+종성은 그대로 반환
     * @param lastWord
     * @return
     */
    private char convertEndChar(char lastWord) {
        char returnWord;

        int idx = IntStream.range(0, initialList.length)
                .filter(i->lastWord == initialList[i]).findFirst().orElse(-1);

        int unicodePoint = Character.toString(lastWord).codePointAt(0);

        if(idx >= 0) {
            // 초성만 있을 경우
            returnWord = (char) (0xAC00 + idx*588 + 587);
        } else if(unicodePoint - 0xAC00 >= 0 && (unicodePoint - 0xAC00) % 28 == 0) {
            // 초성+중성만 있을 경우
            returnWord = (char) (unicodePoint+27);
        } else {
            returnWord = lastWord;
        }

        return returnWord;
    }
}
