package week10_11_12_2022;

import java.util.Arrays;

public class Task6_Fibonacci {
    /*
Task 6 :  Fibonacci
				Create a method that will give you the Fibonacci numbers up to the x value. Where x is the given parameter.
				Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers
				Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, e.t.c
				    Ex:
				        Input:
				            8
				        Output:
				            0, 1, 1, 2, 3, 5, 8, 13, 21
				            1- Create one method and only print the numbers
				            2- You will return the numbers
				            3- Yuo will put that numbers into the array then you will return it
				         */


    public static void main(String[] args) {
        int index = 8;
        int[] result = fibonacciNumbers(index);

    }

    private static int[] fibonacciNumbers(int index) {
        int[] fibNum = new int[9];
     fibNum[0] = 0;
     fibNum[1] = 1;
     String result = "";

        for (int i = 0; i <7; i++) {
fibNum[i+2] = fibNum[i+1] + fibNum[i];

        }
        for (int each : fibNum) {
            result += each + ", ";
        }
        System.out.println(result.substring(0,result.length()-2));

        return fibNum;
    }

}