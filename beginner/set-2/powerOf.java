import java.util.Scanner;
public class powerOf{
    public static void main(String args[]) {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int k = in.nextInt();
     
     System.out.println(givePower(n,k));
    }
    public static int givePower(int n,int k){
        if(k==0)return 1;
        return n * givePower(n,k-1);
    }
}