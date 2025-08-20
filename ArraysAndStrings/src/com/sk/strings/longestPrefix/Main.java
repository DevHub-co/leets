package com.sk.strings.longestPrefix;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("dog");
        trie.insert("racecar");
        trie.insert("flight");
        System.out.println(trie.getPrefix());
    }
}
