package week09_11__5_2022;

public class Task1_EvenOrOdd {
    public static void main(String[] args) {
        //  Write a method that can check if a number is even or odd

        checkNumberEvenOrOdd(5);


    }

    private static void checkNumberEvenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even");

        } else {
            System.out.println(number + " is odd");

        }


    }
}