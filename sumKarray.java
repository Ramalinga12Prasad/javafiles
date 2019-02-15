import java.util.Scanner;
public class sumKarray{
    public static void main(String args[]){
        int sum =0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
        }
        for(int i=0;i<k;i++){
            sum+= a[i];
        }
System.out.println(sum);

    }
}