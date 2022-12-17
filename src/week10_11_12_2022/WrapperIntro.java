package week10_11_12_2022;

public class WrapperIntro {
    public static void main(String[] args) {
        // int double char boolean

        int a=2;
        Integer b = 122;
        Integer c = new Integer(122);
        String number1 = "100";
        String number2 = "200";

        String result = number1 + number2;
        System.out.println(result);
        int result1 = Integer.parseInt(number1);
        int result2 = Integer.parseInt(number2);

        System.out.println(result1 + result2);
// what is the difference parseInt()  and valueOf()
        // valueOf() returns on Object(Wrapper class)
        // parseInt returns primitive data type

        int i = Integer.parseInt("123");

        Integer integer =Integer.valueOf("123");

        int i1 = 12;
        Integer integer1 = i1;//autoboxing primitive -------------> object(wrapper class)

        Integer integer2 = 12;// unboxing object --------------> primitive
        int i2 = integer2;


    }
}
