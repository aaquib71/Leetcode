package com.leetcode.com.java.learn;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

    private static <T>int findSize(List<T> list){
        return list.size();
    }

    public static void main(String[] args) {
        List randomList = new ArrayList<Integer>();
        randomList.add(1);
        randomList.add("String is cool");

        System.out.println(randomList);

        List<String> stringList = new ArrayList<>();
        stringList.add("Awesome Java");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(87);
        integerList.add(53);

        System.out.println(findSize(randomList));
        System.out.println(findSize(stringList));
        System.out.println(findSize(integerList));
    }


}
