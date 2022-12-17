package week11_11_19_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {
        // ho to create an arraylist

        ArrayList<String> cities = new ArrayList<>();
        //ArrayList<String> cities= new ArrayList<String>();

        cities.add("London");
        cities.add("Paris");
        cities.add("Istanbul");
        cities.add("Rome");

        //how to print it
        System.out.println(cities);

        //how to add one element at the beginning

        cities.add(0, "Vienna");
        System.out.println(cities);

        // how to get element
        System.out.println(cities.get(0));// vienna

        // how to update element

        cities.set(2, "NewYork");// set method is returning element you updated
        System.out.println(cities.set(3, "Angara"));
        System.out.println("==========After update============");
        System.out.println(cities);

        // how to lrarn position of the element or index of element

        System.out.println(cities.indexOf("NewYork"));//2

        System.out.println(cities.indexOf("Paris"));// if it is not exist you will get -1

        System.out.println(cities.indexOf("New"));//-1

        // how to find position element
        // lastIndex of()

        System.out.println(cities.lastIndexOf("London"));

        // index of and last index of will give same index if the element is unique

        cities.add("London");
        System.out.println(cities);
        System.out.println(cities.indexOf("London"));// it is checking the element from beginning an d return the index // 1
        System.out.println(cities.lastIndexOf("London"));// it is checking the element form last //5

        // how to remove element

        // ArrayList<Int> arrayList = new ArrayList<Int>(); it will give me compile error

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(1);
        numbers.add(1);
        System.out.println("=======================================================");
        System.out.println(numbers.indexOf(1));// 0
        System.out.println(numbers.lastIndexOf(1));// 7


        System.out.println("======================================");

        ArrayList<Integer> numbers1 = new ArrayList<>();

        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(5);
        numbers1.add(1);

        // how to remove the element

        System.out.println(numbers1);

        System.out.println(numbers1.remove(1));// 3
        System.out.println(numbers1);

        Integer b = 4;
        numbers1.remove(b);
        System.out.println(numbers1);
        System.out.println(numbers1.remove(new Integer(5)));
        System.out.println(numbers1);

        Integer a = new Integer(4);

        // bulk operations
        //addAll

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Mesut", "Osman", "Seyma"));

        // removeAll

        //retainAll

        //removeIf

        System.out.println("==================================");
        System.out.println(numbers);

        numbers.removeIf(p -> p < 3);

        System.out.println(numbers);

        ArrayList<Integer> number3 = new ArrayList<>(Arrays.asList(1,2,3,4,5));


    }
}
