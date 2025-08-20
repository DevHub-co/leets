package com.sk.arrays.twosum;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        twoSumUnique(new int[]{14,1,0,12,3,1},15).forEach(arr->System.out.println(Arrays.toString(arr)));
        System.out.println("---");
        getTwoSum(new int[]{14,1,0,12,3,1},15).forEach(arr->System.out.println(Arrays.toString(arr)));
    }

    public static List<int[]> twoSumUnique(int[] nums, int target){
        Map<Integer,Integer> freqMap = new HashMap<>();
        List<int[]> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int complement = target -nums[i];
            if(freqMap.getOrDefault(complement,0)>0){
                result.add(new int[]{complement,nums[i]});
                freqMap.put(complement,freqMap.get(complement)-1);
            }else{
                freqMap.put(nums[i],freqMap.getOrDefault(nums[i],0)+1);
            }
        }
        return result;
    }

    public static List<int[]> twoSumUniqueIndex(int[] nums, int target){
        List<int[]> result = new ArrayList<>();
        Map<Integer,Integer> freqMap = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(freqMap.containsKey(complement)){
                result.add(new int[]{freqMap.get(complement),i});
                freqMap.remove(complement);
            }else{
                freqMap.put(nums[i],i);
            }
        }
        return result;
    }

    //Bad approach
    public static List<int[]> twoSumNonUniqueIndex(int[] nums, int target){
        List<int[]> result = new ArrayList<>();
        Map<Integer,Integer> freqMap = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];
            if(freqMap.containsKey(complement)){
                result.add(new int[]{freqMap.get(complement),i});
                //freqMap.remove(complement);
            }else{
                freqMap.put(nums[i],i);
            }
        }
        return result;
    }

    private static List<int[]> getTwoSum(int[] nums, int target){
        List<int[]> result = new ArrayList<>();
        Arrays.sort(nums);
        int i=0;
        int j= nums.length-1;
        while(i<j){
            int sum = nums[i]+nums[j];
            if( sum == target){
                result.add(new int[]{nums[i],nums[j]});
                i++;
                j--;
            }else if(sum < target){
                i++;
            }else {
                j--;
            }
        }
        return result;
    }


}
