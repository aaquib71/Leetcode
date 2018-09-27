package com.leetcode.com.java.learn;

public class StringLiterals {

    public static void main(String[] args) {
        String blogName1 = "howtodoinjava.com";
        String blogName2 = "howtodoinjava.com";
        String blogName3 = new String("howtodoinjava.com");

        if(blogName1 == blogName2){
            System.out.println("Same Memory");
        }

        if(blogName1.equals(blogName2)){
            System.out.println("Same Value");
        }

        if(blogName1 == blogName3){
            System.out.println("Same Memory");
        }

        if(blogName1.equals(blogName3)){
            System.out.println("Same Value");
        }
    }
}
