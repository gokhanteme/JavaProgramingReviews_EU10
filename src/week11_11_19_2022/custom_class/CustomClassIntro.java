package week11_11_19_2022.custom_class;

public class CustomClassIntro {
    public static void main(String[] args) {
        // how to create an object

        // Class Name reference = new keyword consractor

        SecondClass secondClass = new SecondClass();
        FirstClass firstObject = new FirstClass(4,"Adam",secondClass);

// how to get attributes

        System.out.println(firstObject.a);
        System.out.println(firstObject.b);


    }
}
