package com.sk.arrays.stackwitharrays;

public class StackNode {

    private int value;
    private int backLink;

    public StackNode(int value, int backLink) {
        this.value = value;
        this.backLink = backLink;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getBackLink() {
        return backLink;
    }

    public void setBackLink(int backLink) {
        this.backLink = backLink;
    }
}
