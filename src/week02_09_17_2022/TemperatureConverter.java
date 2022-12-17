package week02_09_17_2022;

public class TemperatureConverter {
    public static void main(String[] args) {

        double fahrenheit = 255.0 ;
        double celcius = (5*(fahrenheit-32))/9;
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celcius + " in Celcius.");

    }
}
/*
  - Write a Java program to convert temperature from Fahrenheit to Celsius degree
                        - Input a degree in Fahrenheit: 212

                            Formula :         C = (5(F-32))/9

                            Expected Output:
                            212.0 degree Fahrenheit is equal to 100.0 in Celsius
 */