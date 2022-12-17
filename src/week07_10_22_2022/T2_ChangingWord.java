package week07_10_22_2022;

public class T2_ChangingWord {
     /*
    -- Task 2:  Write a programt that replaces every occurrence of "cat" in the message with "dog", using indexOf and substring.

  input:

  String message = "I love cats! I have a cat named Coco. My cat's very smart!";

  output:

 "I love dogs! I have a dog named Coco. My dog's very smart!";
     */
     public static void main(String[] args) {
         String message = "I love cats! I have a cat named Coco. My cat's very smart!";
         String searched = "cat";
         String changed = "dog";
/*
String result1 = message.replace(searched,changed);
System.out.println("result1 = " + result1);
     */
      int indexOfFirstCat = message.indexOf(searched);
      int endOfWord = indexOfFirstCat + searched.length();
        // System.out.println(indexOfFirstCat);
         //System.out.println(endOfWord);

         message = message.substring(0,indexOfFirstCat) + changed + message.substring(endOfWord);

         // w e need to check the message contains cat or not
         while (message.contains(searched)){

             indexOfFirstCat = message.indexOf(searched);
             endOfWord =indexOfFirstCat+searched.length();
             message=message.substring(0,indexOfFirstCat)+changed+message.substring(endOfWord);

         }

         System.out.println(message);
     }
     }

