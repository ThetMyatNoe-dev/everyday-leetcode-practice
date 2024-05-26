package com.leetcode.practice;

import java.util.*;

public class Day_6_ThreeSum {

    public static void main(String[] args) {

        int [] intArray = new int[] {-1,0,1,2,-1,-4};

        var res = threeSum(intArray);
        System.out.println("Result : "+ res);

    }

   public static List<List<Integer>> threeSum(int [] arr){

        if (arr == null ||  arr.length <3 ){
            return  new ArrayList<>();
       }
        //Sort the elements in the array first

        Arrays.sort(arr);

       Set<List<Integer>> result= new HashSet<>();

       //Now fix the first element and find the other two elements
       for (int i = 0 ; i< arr.length-2; i++){

           // Find the other 2 elements using the Two Sum approach

           int left = i+1;
           int right = arr.length-1;

           while (left < right){
               int sum= arr[i] + arr[left] + arr [right] ;

               if (sum == 0){

                   // Add the set , and move to find other triplets
                   result.add(Arrays.asList(arr[i],arr[left],arr[right]));
                   left++;
                   right--;

               }
               else if (sum < 0){
                   left++;
               }
               else
                   right--;
           }

       }
       return  new ArrayList<>(result);




    }

}
