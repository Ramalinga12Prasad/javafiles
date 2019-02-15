import java.util.Scanner;
public class leapYear{
    public static void main(String args[]) {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     if(n%100==0){
         if(n%400==0){
             System.out.println("yes");
         }
         else
         System.out.println("no");
     }
     else{
         if(n%4==0)
         System.out.println("yes");
         else
         System.out.println("no");
     }
    }
}