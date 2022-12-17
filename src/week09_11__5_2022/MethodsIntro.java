package week09_11__5_2022;

public class MethodsIntro {
    public static void main(String[] args) {
// print hello 5 times

        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("--------------------------");
        printHello5Times();

        // we wnt to add two number

        int result = sum(5,6);
        //create method quick
        // for win alt+enter
        //for mac option+enter


        // multiply that number 2 and show in console

multiplyWith2AndPrint((result));

        System.out.println(sum(50, 60));

    }

    private static void multiplyWith2AndPrint(int result) {
        System.out.println(result*2);

    }

    public static int sum(int number1, int number2) {
      return  number2 + number1;

    }


    public  static void  printHello5Times(){

    for (int i = 0; i < 5; i++) {
        System.out.println("Hello");
    }

}



}
