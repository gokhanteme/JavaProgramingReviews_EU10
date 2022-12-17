package week05_10_08_2022;

import java.util.Scanner;

public class RedOrBlue {
    public static void main(String[] args) {
          /*
         Task 4: Given a string, if the string begins with "red" or "blue" print that color string, otherwise print the empty string.

     *                 input :"redxx" → "red"
     *                 input :"xxred" → ""
     *                 input :"blueTimes" → "blue"
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a color");
        String color=scan.next();
        if (color.startsWith("red")){
            System.out.println("red");
        } else if (color.startsWith("blue")) {
            System.out.println("blue");

        }else {
            System.out.println("");
        }scan.close();
    }
}
