package com.leetcode.practice;

public class Day2_FactorialTrailingZeros {

    public static void main(String[] args) {

        var res = numberOfTrailingZerosInGivenNumber(200);
        System.out.println("Number of Trailing Zeros In Given Number "+ res);

    }

    public static int numberOfTrailingZerosInGivenNumber(int num){

        int res= 0;
        int powereOf5 = 5 ;

        while (num >= powereOf5){

            res = res + (num/powereOf5);
            powereOf5 = powereOf5 * 5;
        }


        return  res;

    }
}
