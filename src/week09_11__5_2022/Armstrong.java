package week09_11__5_2022;

public class Armstrong {


    public static void main(String args[]) {
        //method call
        armstrong(500);
    }

    public static void armstrong(int num) {
        int newNum = 0, remainder, temp;
        temp = num;
        //find sum of all digit's cube of the number.
        while (temp != 0) {
            remainder = temp % 10;
            newNum = newNum + remainder * remainder * remainder;
            temp = temp / 10;
        }
        //Check if sum of all digit's cube of the number is
        //equal to the given number or not.
        if (newNum == num) {
            System.out.println(num + " is armstrong.");
        } else {
            System.out.println(num + " is not armstrong.");
        }
    }

}