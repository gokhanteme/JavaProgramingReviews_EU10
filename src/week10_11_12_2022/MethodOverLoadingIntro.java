package week10_11_12_2022;



public class MethodOverLoadingIntro {
    public static void main(String[] args) {
        // I want to add number


        int i = 123;
        double d = 24.5;
        float f= 23.5f;// (float)23.5;

        sum(i,d);
        sum(d,f);
    }

    private static void sum(double d, float f) {
    }

    private static void sum(int i, double d) {
    }
}
