package week06_10_15_2022;

public class T3_ReplaceWord {
    /*
    Task 4: Given a sentence which is string find word how many times repeats in it.

Hint: use replaceFirst() with while loop

input:
*                                String str="Java is java in everywhere is Java";
*                                String word="Java";
output:3
     */

    public static void main(String[] args) {
        String str = "Java is java in everywhere is Java";
        String word = "Java";
        str = str.toLowerCase();
        word = word.toLowerCase();
        int counter = 0;
       /* for (int i = 0; i <= str.length()-word.length(); i++) {
            String ech = str.substring(i, i + word.length());
            if (ech.equalsIgnoreCase(word))
                counter++;
        }
        System.out.println(counter);
         */
        while(str.contains(word)|| str.contains(word.toLowerCase())){
            counter ++;
            str = str.replaceFirst(word,"");
            str = str.replaceFirst(word,"").toLowerCase();
        }

        System.out.println(counter);
        }
    }

