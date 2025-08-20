package com.sk.arrays.stackwitharrays;

public class Main {
    public static void main(String[] args) {

        TheStack theStack = new TheStack();
        theStack.push(1,1);
        theStack.push(2,1);
        theStack.push(3,1);
        theStack.push(4,2);
        theStack.push(5,2);
        theStack.push(6,2);
        theStack.push(7,1);
        theStack.push(8,3);
        theStack.printStack();
        System.out.println("----");
        System.out.println(theStack.pop(1));
        System.out.println(theStack.pop(2));
        System.out.println(theStack.pop(3));
    }
}
