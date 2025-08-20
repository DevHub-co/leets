package com.sk.strings.longestPrefix;

import java.util.Map;

public class Trie {
    private final Node root = new Node();

    public void insert(String word){
        Node curr = root;
        for(char c: word.toCharArray()){
            curr = curr.getChildren().computeIfAbsent(c, k-> new Node());
        }
        curr.setEnd(true);
    }

    public String getPrefix(){
        StringBuilder result = new StringBuilder();
        Node curr = root;
        while(true){
            if(curr.isEnd()) break;
            if(curr.getChildren().size()!=1) break; // this means that the character has two children which means we are at the end of the most common prefix
            Map.Entry<Character,Node> next = curr.getChildren().entrySet().iterator().next();
            result.append(next.getKey());
            curr = next.getValue();
        }
        return result.toString();
    }


}
