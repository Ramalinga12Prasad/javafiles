import java.util.Scanner;
public class helloLoop{
    public static void main(String args[]){
        String hello = "Hello";
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(hello);
        }


    }
}