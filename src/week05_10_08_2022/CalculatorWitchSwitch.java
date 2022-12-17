package week05_10_08_2022;

import java.util.Scanner;

public class CalculatorWitchSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number");
        double number1 =scanner.nextDouble();

        System.out.println("Please enter second number");
        double number2 = scanner.nextDouble();

        System.out.println("Please enter your operator");
        char operator =scanner.next().charAt(0);
        //String operator = scanner.next();
        double result =0;
        switch (operator){
            case '+':
                result =number1 + number2;
                break;
            case '-':
                result =number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case  '/':

                result = number1 / number2;
                break;
            default:
              //  result = number1 % number2;
                System.out.println("Operator is wrong");
        }
        System.out.println(result);
        scanner.close();


        String str4= "Adam";


        /*for (int i = 0; i < 4; i++) {
            System.out.println(str4);
        }

        */
        System.out.println(str4.repeat(4));
        scanner.close();
    }
}
