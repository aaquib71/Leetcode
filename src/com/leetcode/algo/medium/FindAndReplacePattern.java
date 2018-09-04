package com.leetcode.algo.medium;

import java.util.*;

public class FindAndReplacePattern {
    public static List<String> findAndReplacePattern(String[] words, String pattern) {

        int size = pattern.length();
        List<String> results = new ArrayList<>();

        for(String word : words){
            boolean unmached = false;
            Map<Character, Character> wordToPattern = new HashMap<>();
            Map<Character, Character> patternToWord = new HashMap<>();
            for(int i=0; i<size; i++){
                Character pChar = pattern.charAt(i);
                Character wChar = word.charAt(i);

                if(patternToWord.containsKey(pChar)){
                    if(!wChar.equals(patternToWord.get(pChar))) {
                        unmached = true;
                        break;
                    }
                }else{
                    patternToWord.put(Character.valueOf(pChar),  Character.valueOf(wChar));
                }
                if(wordToPattern.containsKey(wChar)){
                    if(!pChar.equals(wordToPattern.get(wChar))) {
                        unmached = true;
                        break;
                    }
                }else {
                    wordToPattern.put(Character.valueOf(wChar), Character.valueOf(pChar));
                }
            }
            if(!unmached){
                results.add(word);
            }
        }
        return results;

    }

    public static void main(String[] args) {
        String pattern = "abb";
        String[] words = {"abc","deq","mee","aqq","dkd","ccc"};

        System.out.println(findAndReplacePattern(words, pattern));
    }
}
