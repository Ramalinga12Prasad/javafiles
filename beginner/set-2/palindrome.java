import java.util.Scanner;
public class palindrome{
    public static void main(String args[]) {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int k = reverse(n);    
     
     if(n==k)
     System.out.println("yes");
     else
     System.out.println("no");
    }
    public static int reverse(int n){
        int k = 0;
        int i=0;
    while(n>0){
        k = (k*10)+ (n%10);
        n/=10;


    }
return k;

    }
    
}