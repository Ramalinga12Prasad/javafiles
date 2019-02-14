import java.util.Scanner;

public class max3{
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = Math.max(n,in.nextInt());
        l = Math.max(l,in.nextInt());
        System.out.println(l);
      
    }
}