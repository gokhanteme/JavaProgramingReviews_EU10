package week06_10_15_2022;

public class T2_CountWords {
    /*
    Task 2: Given a sentence which is string and count the words in it.

input:

  String str="Java is java in everywhere is Java";

  output:7
     */
    public static void main(String[] args) {
        String str="Java is java in everywhere is Java";
        String temp = "";
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                count ++;


        }

        System.out.println(count+1);



        }

    }

/*
Task 3: Given a sentence which is string and print the each word.


input:

String str="Java is java in everywhere is Java";

output:
Java
is
java
in
.
.
.
 */