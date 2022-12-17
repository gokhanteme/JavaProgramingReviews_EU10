package week05_10_08_2022;

import java.util.Scanner;

public class WithOutFirtAndLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a word");
        String word = scanner.next();
        String result="";
        if (word.length()<=2){
            result=word;
        }else {
            result=word.substring(1,word.length()-1);
        }scanner.close();
    }
}
