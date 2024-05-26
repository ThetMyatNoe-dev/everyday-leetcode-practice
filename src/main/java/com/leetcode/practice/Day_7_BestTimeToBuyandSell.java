package com.leetcode.practice;

import java.util.*;

public class Day_7_BestTimeToBuyandSell {

    public static void main(String[] args) {

        int [] buy_price = new int[] {7,1,5,3,6,4};

        var res = maxProfit(buy_price);
        System.out.println("Result : "+ res);

    }

   public static int maxProfit(int [] prices){

        // at the beginning the minimum price is the first price
       int buy_price = prices [0];
       int maxProfit = 0;

       for (int i =1; i <prices.length ;i++ ){

           //if the current prices is less update the buy_price

           if(prices[i] < buy_price){
               buy_price= prices[i];
           }
           else {
               int currentProfit = prices[i] - buy_price;
               maxProfit= Math.max(maxProfit, currentProfit);
           }

       }
       return maxProfit;
    }

}
