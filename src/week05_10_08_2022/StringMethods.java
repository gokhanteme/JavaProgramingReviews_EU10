package week05_10_08_2022;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        //if you want to get specific char.charAt()
        //0123
        String str = "Adam";
        str.charAt(0);
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(3));

        // if we want to get the length
        System.out.println(str.length());

        //get the last character
        int lengthOfTheString = str.length();
        int indexOfLastCharacter = lengthOfTheString - 1;
        System.out.println(indexOfLastCharacter);

        // in order  to make etters lower and upper case
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
// in order to remove spaces before and after your string trim()
        String str1 = "     Adam    ";
        System.out.println(str1.trim());//String is immutable

        //if you want to char or string we need to is indexOf() methods

        String number = "0123456";
        //get to index 3
        System.out.println(number.indexOf("34"));
        //get to index 34
// get the index of 14
        System.out.println(number.indexOf("14"));// it will return -1 means that is no 14 in that string
        String sentence = "Java is a programming language";
        System.out.println(sentence.indexOf("programming"));
String sentence1 = "Java is Java";
        System.out.println(sentence1.indexOf("Java"));
        System.out.println(sentence1.lastIndexOf("Java"));

        String sentence3 = "Java is a hard prog language";
        System.out.println(sentence3.replace("hard", "easy"));

       /* Task 1: Given a string, print the string made of its first two chars,
        so the String "Hello" yields "HE".
        */
        String  sentence4 = "Hello";
        System.out.println("" +sentence4.charAt(0) + sentence3.charAt(1));

        String sentence5 = "Java is not same with java";
        System.out.println(sentence5.replaceFirst("Java", "C#"));


        //if we want to get some part of the string we need to use substring
        String subs ="Cydeo";
        System.out.println(subs.substring(1, 4));
        System.out.println(subs.substring(0, 2));

        //get the "deo" from subs variable
        System.out.println(subs.substring(2));

      /*  Task 3: Given a string, return a
      version without the first and last char, so "Hello" yields "ell".
   */

        String s="Hello";
        System.out.println(s.substring(1,4));

        String str6 = "Word";
        String str7 = "word";
        System.out.println(str6.equals(str7));
        System.out.println(str6.equalsIgnoreCase(str7));


        //startsWith
        System.out.println("--------------------------------------------");
        String sentence6= "Java is agood language";
        System.out.println(sentence6.startsWith("Java"));


        //contains method is using for checking the given char sequence is in string or not

        String sentence7= "Java is a Java";
        System.out.println(sentence7.contains("J"));

        System.out.println("----------------------");
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
