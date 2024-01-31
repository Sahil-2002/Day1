import java.util.Scanner;
//Write a program to check two strings are equal or not.
public class sum3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two strings ");
        String first = sc.next();
        String second = sc.next();
        if(first.equals(second)){

            System.out.println("both are same ");
        }
        else{

            System.out.println("both are different ");
        }
    }
}

