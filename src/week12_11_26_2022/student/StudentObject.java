package week12_11_26_2022.student;

import java.util.Scanner;

public class StudentObject {
    public static void main(String[] args) {

        Student student1 = new Student("Adam");

        System.out.println(student1);

        student1.age = 12;
        student1.batchNumber = 34;

        System.out.println(student1);

        String name = "Adam";

        Student student2 = new Student(name);

        System.out.println(student1);
        //I will get my age and batch number from user

        Scanner scanner = new Scanner(System.in);
        System.out.println("please input " + name + "'s age");

        int age = scanner.nextInt();

        student1.age = age;

        System.out.println("please input " + name + "'s batch umber");

        int batch = scanner.nextInt();


        student1.batchNumber = batch;
        scanner.close();

        System.out.println("student1 = " + student1);
        scanner.close();
    }
}
