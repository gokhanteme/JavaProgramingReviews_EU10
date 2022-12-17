package week07_10_22_2022;

import java.util.Random;
import java.util.Scanner;

public class T1FindingHiddenNumbers {
    public static void main(String[] args) {
      /*

       */
       Random random = new Random();

        int hiddenNumber = random.nextInt(10) + 1;//we have one number in that
        // variable from 1 to 10
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Enter a number");
            int searchNumber=scanner.nextInt();
            if (searchNumber ==hiddenNumber){
                System.out.println("you find number congrats !");
                flag = false;
            }else{
                System.out.println("try again");
            }
        }while (flag);


    }
}
