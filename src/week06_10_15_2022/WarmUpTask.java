package week06_10_15_2022;


import java.io.FilterOutputStream;

public class WarmUpTask {
    public static void main(String[] args) {
       String word = "Code";
String temp = "";

        for (int i = 0; i < word.length(); i++) {
            String str= word.substring(0,i);
            temp +=str;
        }


        System.out.println(temp+word);

String word1= "abc";
        String temp1 = "";
        for (int i = 0; i < word1.length(); i++) {
           String str1= word1.charAt(0)+word1.substring(0,i) ;
           temp1 =str1;
        }
        System.out.println(temp1 +word1);
    }
}
/*
- Given a non-empty string like "Code" print a string like below output.

 *                                 Code → "CCoCodCode"
 *                                 abc → "aababc"
 *                                 ab → "aab"
 */