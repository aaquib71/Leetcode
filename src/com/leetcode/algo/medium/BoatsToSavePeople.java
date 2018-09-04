package com.leetcode.algo.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BoatsToSavePeople {

    public static int numRescueBoats(int[] people, int limit) {

        int size = people.length;
        Arrays.sort(people);

        Map<Integer, Boolean> done = new HashMap<>();
        int count = 0;

        for(int i= 0; i<size; i++){
            if(done.containsKey(Integer.valueOf(i))) continue;
            for(int j=size-1; j>i; j--){
                if (!done.containsKey(Integer.valueOf(j))) {
                    if(people[i] + people[j] <= limit){
                        done.put(Integer.valueOf(i), true);
                        done.put(Integer.valueOf(j), true);
                        count++;
                    }
                }
            }
            if(!done.containsKey(Integer.valueOf(i))){
                done.put(Integer.valueOf(i), true);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] people = {3, 5, 3, 4};
        int limit = 5;
        System.out.println(numRescueBoats(people,limit));

    }
}
