package com.leetcode.practice;

/*
User
Write java program for Have the function StringChallenge(str) take the str parameter and swap the case of each character.
Then, if a letter is between two numbers (without separation), switch the places of the two numbers.
For example: if str is "6Hello4 -8World, 7 yes3" the output should be 4hELLO6 -8wORLD, 7 YES3.
Examples
Input: "Hello -5LOL6"
Output: hELLO -6lol5
Input: "2S 6 du5d4e"
Output: 2s 6 DU4D5E
 */
public class Day4_SwapCaseAndNumbers {

    public static String swapCaseAndNumbers(String str) {

        char[] chars = str.toCharArray();
        boolean isNumber= false;

        for (int i=0; i<chars.length ; i++){
            char c = chars[i];

            if(Character.isDigit(c)){
                isNumber= true;
            }
            else if (Character.isLetter(c)){
                chars[i]=Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
            }

            if(isNumber && i>0 && i< chars.length -1){

            }
        }

        return null ;


    }


    public static void main (String[] args){
        String input1="Hello -5LOL6";
        String input2="2S 6 du5d4e";


    }
}
