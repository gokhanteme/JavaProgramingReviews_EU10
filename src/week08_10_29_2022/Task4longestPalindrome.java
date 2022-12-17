package week08_10_29_2022;

public class Task4longestPalindrome {
    public static void main(String[] args) {
        String[] words = {"Java", "Longer word", "civic", "apple","racecar", "mom", "anna"};
String longestPalindrome = "";
        for (String eachWord : words) {

            boolean isPalindrome = true;
            for (int i = 0; i < eachWord.length()/2; i++) {
                char ch1= eachWord.charAt(i);
                char ch2= eachWord.charAt(eachWord.length()-i-1);

                if (ch1!=ch2){
                    isPalindrome=false;
                    break;
                }
                if (isPalindrome&&eachWord.length()>longestPalindrome.length()){
                    longestPalindrome =eachWord;
                }
            }

        }

        System.out.println(longestPalindrome);


    }
}
/*
 For Each - Nested For

            Longest Palindrome

                Given a String array. Find the longest Palindrome String in your array.
                    Ex:
                    Input: ["java”, "longer word”, "civic” "apple”, "racecar”, "mom”, "anna”] Output: racecar
                    Ex:
                    Input: ["abc”, "dna”, "kevin”, "joe”, "lamp”]
                    Output: No palindrome
 */