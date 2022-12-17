package week05_10_08_2022;

public class LoopIntro {
    public static void main(String[] args) {
        String str= "0123456";
        str.charAt(0);
        str.charAt(1);

        for (int index = 0; index < str.length(); index++) {

            System.out.println(str.charAt(index));
        }
        // write the numbers 0 to 10

        for (int i = 0; i <100 ; i++) {
            System.out.println(i);

        }

        for (int i = 0; i <=100 ; i+=2) {
            System.out.print(i+" ");

        }

        for (int i = 1; i < 99; i+=2) {
            System.out.print(i+" ");
        }
    }
}
