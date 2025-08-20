package com.sk.arrays.subarraymax;

public class MaxOfSubArray {

    public static void main(String[] args) {
        System.out.println(maxiOfSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    public static int maxiOfSubArray(int[] arr) {
        int sum =0;
        int currSum = 0;
        int i=0;
        while(i<arr.length){
            currSum+=arr[i];
            if(currSum>sum){
                sum = currSum;
            }else if(currSum<=0){
                currSum=0;
            }
            i++;
        }
        return sum;
    }
}
