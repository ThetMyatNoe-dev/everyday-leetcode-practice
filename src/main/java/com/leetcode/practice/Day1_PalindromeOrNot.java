package com.leetcode.practice;

public class Day1_PalindromeOrNot {

    public static void main(String[] args) {

        var res = palindromeCheck_Number(200);
        System.out.println("Given number is Palindrome or Not :  "+ res);

        res = palindromeCheck_String("A man, a plan, a canal: Panama");
        System.out.println("Given string is Palindrome or Not :  "+ res);

    }

    public static boolean palindromeCheck_Number(int num){

        if (num < 0){
            return false ;
        }

        int original = num , reverse = 0;

        while (num/10 !=0){

            reverse = reverse + num%10;
            num /=10;
        }
        return  original == reverse;

    }

    public static boolean palindromeCheck_String(String input){

        //first -> filter out only character , except character , remove all .
        String cleanTheInputText = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int length = cleanTheInputText.length();

        int forwardPointer = 0;
        int backwardPointer =length-1;

        while (backwardPointer > forwardPointer ){

            char forwardChar = cleanTheInputText.charAt(forwardPointer++);

            char backwardChar = cleanTheInputText.charAt(backwardPointer--);


            if (forwardChar != backwardChar){
                return  false;
            }
        }
        return  true;

    }
}
