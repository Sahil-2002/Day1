import java.util.Scanner;

public class springseason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the month number = ");
        int m = sc.nextInt();
        System.out.println("enter the day = ");
        int d = sc.nextInt();

            if ((m == 3 && d >= 20 && d <= 31) || (m >= 3 && m <= 6) || (m == 6 && d <= 20)) {
                System.out.println("its spring ");

            } else {
                System.out.println("its not spring ");
            }
        }
    }

