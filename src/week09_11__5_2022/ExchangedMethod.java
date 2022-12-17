package week09_11__5_2022;

public class ExchangedMethod {
    public static void main(String[] args) {


        String result = exFirstAndLast("Java");
        System.out.println(result);
    }

    private static String exFirstAndLast(String str) {

        char[] ch = str.toCharArray();

        char temp = ch[0];

        ch[0] = ch[ch.length - 1];

        ch[ch.length - 1] = temp;

        return String.valueOf(ch);

    }
}