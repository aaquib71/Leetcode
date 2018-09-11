package com.leetcode.algo.medium;

public class DecodedStringAtIndex {

    public static String decodeAtIndex(String S, int K) {

        int size = S.length();
        int totalSize = 0;
        for(int i=0; i<size; i++){
            Character c = S.charAt(i);
            if(Character.isDigit(c)){
                int digit = Character.getNumericValue(c);
                totalSize = totalSize * digit;
            }else totalSize++;
        }
        for(int i=size-1; i>=0; i--){
            Character c = S.charAt(i);
            K = K % totalSize;
            if(Character.isDigit(c)){
                int digit = Character.getNumericValue(c);
                totalSize = totalSize / digit;
            }else {
                if(K==0 ) return Character.toString(c);
                totalSize--;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String S = "LEET2CODE3";
        int K = 9;
        System.out.println(decodeAtIndex(S, K));
    }
}
