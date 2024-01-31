import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int N = sc.nextInt();
        int remainder =0;
        while(N>0){

            int r = N%10;
            remainder = remainder*10 + r;
            N=N/10;

        }
        System.out.print(remainder);

    }

}