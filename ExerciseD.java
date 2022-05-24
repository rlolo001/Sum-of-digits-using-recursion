package com.company;
/*
Slide 17
Write a program in Java to count the digits of a given number using recursion.

 */

public class ExerciseD {
    public static int countNumbers(int number){
        int count = number;

        if(number == 0){
            return count;

        }else{
            System.out.println(number);
            countNumbers(count = count + 1 );
        }
        return number;
    }
    public static void main(String[] args) {
        countNumbers(8);
    }
}
