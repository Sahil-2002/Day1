import java.util.Scanner;

public class MONTH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();
        if(num>=1 && num<=12){
            switch(num){

                case 1:
                    System.out.println(num +"month is January ");
                    break;
                case 2:
                    System.out.println(num +"month is feb ");
                    break;
                case 3:
                    System.out.println(num +"month is March ");
                    break;
                case 4:
                    System.out.println(num +"month is April ");
                    break;
                case 5:
                    System.out.println(num +"month is May ");
                    break;
                case 6:
                    System.out.println(num +"month is June ");
                    break;
                case 7:
                    System.out.println(num +"month is July ");
                    break;
                case 8:
                    System.out.println(num +"month is August ");
                    break;
                case 9:
                    System.out.println(num +"month is sept ");
                    break;
                case 10:
                    System.out.println(num +"month is oct ");
                    break;
                case 11:
                    System.out.println(num +"month is Nov");
                    break;
                case 12:
                    System.out.println(num +"month is dec ");
                    break;
                default:
                    System.out.println("invalid input ");






            }



        }
else {
            System.out.println("invalid input ");
        };


    }
}
