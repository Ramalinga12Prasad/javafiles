import java.util.Scanner;
public class sumN{
    public static void main(String args[]){
        int sum =0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            sum+= i;
        }
System.out.println(sum);

    }
}