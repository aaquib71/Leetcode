package com.leetcode.com.java.learn;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, String> mapp = new HashMap<>();

        System.out.println(mapp.put("India", "Virat Kohli"));
        System.out.println(mapp.put("Pakistan", "Sarfaraz Ahmed"));
        System.out.println(mapp.put("India", "Rohit Sharma"));

        Collection<String> collection = Arrays.asList("How", "To", "Iterate", "In", "Java");

        collection.forEach(s -> System.out.println(s));
    }
}
