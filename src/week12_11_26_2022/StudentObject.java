package week12_11_26_2022;


import java.util.Scanner;

class Student {

    /*
    Class Name: Student

            instance variables:
                    name, age, batchNumber

            static variables :
                    school

            1st constructor: initializes the name ONLY

            2nd constructor: initializes name & age
                        (MUST use constructor call to set the name)

            3rd Constructor: initializes name, age ,batchNumber
                        (MUST use constructor call to set the name & age)


            instance methods: toString()
     */

    public String name;
    public int age;
    public long batchNumber;

    public static String schoolName = "Cydeo";

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this(name);
        this.age = age;
    }

    public Student(String name, int age, long batchNumber) {
        this(name, age);
        this.batchNumber = batchNumber;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", schoolName= " + schoolName +
                '}';
    }
}


public class StudentObject {
    public static void main(String[] args) {

        week12_11_26_2022.student.Student student1 = new week12_11_26_2022.student.Student("Adam");

        System.out.println(student1);

        student1.age = 12;
        student1.batchNumber = 34;

        System.out.println(student1);

        String name = "Adam";

        week12_11_26_2022.student.Student student2 = new week12_11_26_2022.student.Student(name);

        System.out.println(student1);
        //I will get my age and batch numbre from user

        Scanner scanner = new Scanner(System.in);
        System.out.println("please input " + name + "'s age");

        int age = scanner.nextInt();

        student1.age = age;

        System.out.println("please input " + name + "'s batch umber");

        int batch = scanner.nextInt();


        student1.batchNumber = batch;
        scanner.close();

        System.out.println("student1 = " + student1);
    }
}

