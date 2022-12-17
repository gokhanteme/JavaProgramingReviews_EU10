package week04_10_01_2022;

public class CodilityTask {


        /*
        Task 1:
  Write a function:
            that, given a positive integer N  However, any number divisible by 2, 3
             or 5 shouldbe replaced by the word

                                Codility -- 2
                                Test     -- 3
                                Coders   -- 5

            - If a number is divisible by more than one of the numbers:2,3 or 5,
             it should be replaced by a concatenation of the respective words Codility,
              Test and Coders in this given order.

                                EXPECTED

                        numbers divisible by both 2 and 3 should be replacée by CodilityTest
                        INPUT : 6    OUTPUT :  CodilityTest

                        numbers divisible by allthree numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
                        INPUT : 30    OUTPUT :  CodilityTestCoders

         */
        public static void main(String[] args) {


            //we will get one number the user (create a veriable)
            int number = 13;
            //we will create a veriable in order to put our result in it
            String result = "";
            // we will check  the nuber is positive or negative
            if (number > 0) { // I can go on with other steps
                if (number % 2 == 0) {
                    result = "Codility";
                }  if (number % 2 == 0 && number % 3 == 0) {
                    result = "CodilityTest";

                } if (number % 2 == 0 && number % 3 == 0 && number % 5 == 0) {
                    result = "CodilityTestCoders";

                }if (number %2 ==1){
                    result = "The number not codility,codility and codilityTester.";
                }

            } else {
                System.out.println("Your number is smaller than zero.");
            }
            System.out.println(result);
            // if the number is positive, we will check the number divisible by two
            //we put the codility inside the veriable


        }}


