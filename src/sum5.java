import java.util.Scanner;
//Read a single Digit Number and write in word
public class sum5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the single digit number = ");
        int number = sc.nextInt();

            switch (number) {

                case 0:
                    System.out.println("zero");
                    break;

                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two ");
                    break;
                case 3:
                    System.out.println("three ");
                    break;
                case 4:
                    System.out.println("four ");
                    break;
                case 5:
                    System.out.println("five ");
                    break;
                case 6:
                    System.out.println("six ");
                    break;
                case 7:
                    System.out.println("seven ");
                    break;
                case 8:
                    System.out.println("eight  ");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                default:
                    System.out.println("invalid input ");
            }


        }



    }

