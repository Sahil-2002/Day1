import java.util.Scanner;
//Write a program to demonstrate static variables, methods, and blocks.
public class sum6 {
    // static variable
    static int a =10;
    // static block
    static {
        System.out.println("this is static block executed ");}
    static {
        System.out.println(a);
    }
    // static method
    static void method(){

        System.out.println("this is static method ");
    }

    public static void main(String[] args) {
        System.out.println("static variable is "+ a );
        method();
    }


    }







