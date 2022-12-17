package week08_10_29_2022;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,5,4};

        for (int each : numbers) {
            System.out.println(each);
        }
        // toCharArray()

        String str = "Adam";
        char[] letters = str.toCharArray();
        for (char letter : letters) {
            System.out.println(letter);
        }
        //to split(regex)
        System.out.println("-------------------------------------------");
        String sentence = "Java is a good language.";
        String[] words = sentence.split(" ");
        for (String s1 : words) {
            System.out.println(s1.replace(".",""));
        }
        System.out.println(Arrays.toString(words));


    }
}
