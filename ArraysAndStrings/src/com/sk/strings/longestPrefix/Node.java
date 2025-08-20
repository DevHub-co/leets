package com.sk.strings.longestPrefix;

import java.util.HashMap;
import java.util.Map;

public class Node {

    private Map<Character,Node> children;
    private boolean isEnd;

    public Node() {
        this.children = new HashMap<>();
    }

    public Node(boolean isEnd) {
        this.isEnd = isEnd;
    }

    public Node(Map<Character, Node> children, boolean isEnd) {
        this.children = children;
        this.isEnd = isEnd;
    }

    public Map<Character, Node> getChildren() {
        return children;
    }

    public void setChildren(Map<Character, Node> children) {
        this.children = children;
    }

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }
}
