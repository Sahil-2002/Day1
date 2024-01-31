import java.util.Scanner;

//Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5
public class naturalsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
       int Number = sc.nextInt();
       int i = 0;
     int   sum=0;
     while(i<=Number){
         sum=sum+i;
         i++;

     }
        System.out.println(sum);
    }
}
