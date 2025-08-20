package com.sk.arrays.reverserafterm;

import java.util.List;

public class Main {

    public static void main(String[] args) {
//        sortPartial(Arrays.asList(1, 2, 3, 4, 5, 6),2).forEach(System.out::println);
       // return Integer.parseInt(args[0]) * Integer.parseInt(args[1]);
    }

    public static List<Integer> sortPartial(List<Integer> intList, int m){
        int start = m+1;
        int end = intList.size()-1;
        while(start<end){
            int temp = intList.get(start);
            intList.set(start,intList.get(end));
            intList.set(end,temp);
            start++;
            end--;
        }
        return intList;
    }
}
