package week12_11_26_2022.statics;

public class StaticWorkStyle {

    static {

//file read
        System.out.println("First staic");
    }

// use that file and assign another static variable
    static {
        System.out.println("second static");
    }


    public static void main(String[] args) {
        methodStatic();
        System.out.println("main method");



    }
public static void methodStatic(){
    System.out.println("method static");
}
    static {
        System.out.println("third static");
    }
}
