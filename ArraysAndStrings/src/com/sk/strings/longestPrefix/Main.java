package com.sk.strings.longestPrefix;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("dog");
        trie.insert("racecar");
        trie.insert("flight");
       // System.out.println(trie.getPrefix());
        String[] strArr = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strArr));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
