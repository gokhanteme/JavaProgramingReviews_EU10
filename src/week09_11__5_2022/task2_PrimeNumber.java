package week09_11__5_2022;

public class task2_PrimeNumber {
    public static void main(String[] args) {
        //  Write a method that can check if a number is prime or not
        //
        //                Note : Prime numbers are special numbers, greater than 1, that have exactly two factors, themselves and 1


       boolean result = isPrime(-8);
        System.out.println(result);
    }

    private static boolean isPrime(int number) {
boolean isPrimeNumber = true;
if (number< 2){
    return  false;
}
        for (int i = 2; i <number ; i++) {
            if (number % i ==0){
              isPrimeNumber = false;
              break;
            }
        }
        return isPrimeNumber;
    }
}
