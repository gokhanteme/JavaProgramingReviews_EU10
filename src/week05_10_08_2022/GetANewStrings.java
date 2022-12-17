package week05_10_08_2022;


public class GetANewStrings {
    public static void main(String[] args) {
        /*
        Task 2: Create a logic print a new string made of 3 copies of
        the last 2 chars of the original string.
          Hint: The string length will be at least 2.
         */
        String word = "Hello";
        int indexoflastChar = word.length() - 1;
        int indexOfSecondFromLast = word.length() - 2;
        char last = word.charAt(indexoflastChar);
        char beforeLast = word.charAt(indexOfSecondFromLast);
        String lastTwo = "" + beforeLast + last;
        System.out.println(lastTwo + lastTwo + lastTwo);

    }
}
