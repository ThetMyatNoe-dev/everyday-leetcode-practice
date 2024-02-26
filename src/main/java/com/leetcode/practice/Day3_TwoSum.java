package com.leetcode.practice;

import java.util.Arrays;
import java.util.HashMap;

public class Day3_TwoSum {

    public static void main(String[] args) {

        int [] intArray = new int[] {2,7,11,15};
        int target = 9;
        var res = twoSum(intArray, target);
        System.out.println("Two array item that can have target value: "+ Arrays.toString(res));



    }

    public static int[] twoSum(int[] nums , int target){

        int[] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i< nums.length;i++){
            int diff = target-nums[i];
            if(!map.containsKey(diff)){
                map.put(nums[i],i);
            }
            else {
                ans[0]=i;
                ans[1]=map.get(diff);
            }
        }
        return ans;
    }
}