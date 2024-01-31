import java.util.Scanner;
//  Write a LeapYear.java program
public class sum4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("enter the year = ");
      int   year = sc.nextInt();
      if(year>=1582) {

          if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

              System.out.println(year + " is leap year ");
          } else {

              System.out.println(year + " is not leap year ");
          }
      }
      else{
           System.out.println("invalid input of year");
      }

      }


    }
}
