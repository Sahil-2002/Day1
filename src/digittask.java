import java.util.Scanner;
//Read a Number 1,10,100,1000 and display unit, ten hundred
public class digittask{
    public static void main(String[] args) {
        System.out.println("enter the number 1 , 10 , 100, 1000");
        Scanner sc = new Scanner(System.in);
       int  number = sc.nextInt();
        int unit = number%10;
        int ten = (number/10)%10;
        int hundered = (number/100)%10;
        int thousand = (number/1000)%10;
       if(number==1 || number==10 ||number==100 || number == 1000 )

       {
           switch(number){
               case 1:
                   System.out.println("unit place unit is "+unit);
                   System.out.println("tens place is "+ten);
                   System.out.println("hundred place is "+hundered);
                   System.out.println("thousand place is "+thousand);
                   break;
               case 10:
                   System.out.println("unit place unit is "+unit);
                   System.out.println("tens place is "+ten);
                   System.out.println("hundred place is "+hundered);
                   System.out.println("thousand place is "+thousand);
                   break;
               case 100:
                   System.out.println("unit place unit is "+unit);
                   System.out.println("tens place is "+ten);
                   System.out.println("hundred place is "+hundered);
                   System.out.println("thousand place is "+thousand);
                   break;
               case 1000:
                   System.out.println("unit place unit is "+unit);
                   System.out.println("tens place is "+ten);
                   System.out.println("hundred place is "+hundered);
                   System.out.println("thousand place is "+thousand);
                   break;


       }
    }
       else {
           System.out.println("invalid choice ");}
    }

}
