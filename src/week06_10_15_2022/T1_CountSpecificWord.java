package week06_10_15_2022;

public class T1_CountSpecificWord {
    /*
    Task 1: Given a sentence which is string find word how many times repeats in it.

Hint: use substring with for loop

input:
*                                String str="Java is java in everywhere is Java";
*                                String word="Java";
output:3
     */
    public static void main(String[] args) {

        String str = "Java is java in everywhere is Java";
        String word = "Java";
        int counter = 0;
        for (int i = 0; i <= str.length()-word.length(); i++) {
            String ech = str.substring(i, i + word.length());
            if (ech.equalsIgnoreCase(word))
                counter++;
        }
        System.out.println(counter);

    }
}
