package com.sk.strings.anagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupOfAnagram {

    public static void main(String[] args) {
        groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}).forEach(System.out::println);
        groupAnagrams(new String[]{""}).forEach(System.out::println);

    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> theAnagrams = new HashMap<>();

        for(String str: strs){
            char [] charArr = str.toCharArray();
            int[] keys = new int[26];
            StringBuilder key = new StringBuilder();
            for (char c : charArr) {
                keys[c - 'a']++;
            }
            for(int i : keys){
                key.append(i).append("#");
            }
            System.out.println(str+": "+key);
            theAnagrams.computeIfAbsent(key.toString(), k-> new ArrayList<>());
            theAnagrams.get(key.toString()).add(str);

        }
        return new ArrayList<>(theAnagrams.values());
    }
}
