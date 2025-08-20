package com.sk.arrays.stackwitharrays;

public class TheStack {

    private StackNode[] stackArray;
    private int size;
    private static  final int SIZE_CAPACITY= 15;
    private static final int[] STACK_TOPS = new int[]{-1,-1,-1};
    private int nextFreeSlot;

    public TheStack() {
        stackArray = new StackNode[SIZE_CAPACITY];
        for(int i=0;i<SIZE_CAPACITY;i++){
            stackArray[i] = new StackNode(0, i+1);
        }
    }

    public void push(int value, int stackNumber){
        int stack = stackNumber -1;
        int currentFree = getFreeSlot();
        int currentTop = STACK_TOPS[stack];

        stackArray[currentFree].setValue(value);
        stackArray[currentFree].setBackLink(currentTop);

        STACK_TOPS[stack] = currentFree;//changing the current tops
    }

    public int pop(int stackNumber){
        int stack = stackNumber -1;
        int currentTop = STACK_TOPS[stack];
        if(currentTop ==-1){
            throw new RuntimeException("Under flow");
        }
        StackNode currentNode = stackArray[currentTop];
        STACK_TOPS[stack] = currentNode.getBackLink();
        currentNode.setBackLink(nextFreeSlot);
        nextFreeSlot = currentTop;
        size--;
        return currentNode.getValue();
    }

    private int getFreeSlot(){
        if(size>=SIZE_CAPACITY){
            throw new RuntimeException("Stack is full");
        }
        int free = nextFreeSlot;
        nextFreeSlot = stackArray[free].getBackLink();
        size++;
        return free;
    }

    public void printStack(){
        for(StackNode currentNode: stackArray){
            System.out.println(currentNode.getValue());
        }
    }

}
