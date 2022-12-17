package week04_10_01_2022;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter one integer number");
        int intValue = scanner.nextInt();

        System.out.println("intValue = " + intValue);
        scanner.close();
    }
}
