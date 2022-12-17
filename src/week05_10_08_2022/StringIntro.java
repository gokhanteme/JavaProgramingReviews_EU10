package week05_10_08_2022;

public class StringIntro {
    public static void main(String[] args) {
        //we can create String two diffirent ways
        //1.String literal
        String str = "Kazim";
        String str1 = "Kazim";

        System.out.println(str == str1);

        //2.new keyword
        String str2 = new String("Kazim");
        String str3 = new String("Kazim");

        System.out.println(str2 ==str3);
    }
}
