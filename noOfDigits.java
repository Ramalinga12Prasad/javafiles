import java.util.Scanner;
public class noOfDigits{
    public static void main(String args[]) {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int digitCount = 0;
     while(n>0){
        digitCount++;
        n/=10;



     }
     System.out.println(digitCount);

    }
}