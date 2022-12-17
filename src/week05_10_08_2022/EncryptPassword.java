package week05_10_08_2022;

import java.util.Scanner;

public class EncryptPassword {
    public static void main(String[] args) {
        /*
        Task 9: Given a string password. Encrypt with "x" a given password and print.

    Hint: do with for loop

     * password: cydeo
     * encrypt with char :x
     * output:cxyxdxexox
         */
        System.out.println("Enter a word: ");
        String word = new Scanner(System.in).next();
String password="cydeo";
char encryptWith='x';

String encyptPassword="";

        for (int i = 0; i < password.length() ; i++) {
            encyptPassword +="" +password.charAt(i)+encryptWith;
        }
        System.out.println(encyptPassword);
    }
}
