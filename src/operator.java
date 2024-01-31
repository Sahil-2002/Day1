import java.util.Scanner;
//Enter two numbers and do the following arithmetic Operations find max and min.
public class operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a = ");
        int a = sc.nextInt();
        System.out.println("enter the value of b = ");
        int b = sc.nextInt();
        System.out.println("enter the value of c = ");
        int c =sc.nextInt();

        int t1 =a+b*c;
        System.out.println(t1);
        int t2 = c+a/b;
        System.out.println(t2);
        int t3 = a%b+c;
        System.out.println(t3);
        int t4 = a*b+c ;
        System.out.println(t4);
        if(t1>t2 && t1>t3 && t1>t4){
            System.out.println("max is "+t1);
        }
            else if(t2>t1 && t2>t3 && t2>t4){
                System.out.println("max is "+t2);

            } else if ( t3>t1 && t3>t2 && t3>t4) {
            System.out.println("max is "+t3);

        }
            else {
            System.out.println("max is "+t4);
        }

    }
    }

