import java.util.Scanner;
public class evenIntervals{
    public static void main(String args[]) {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int k = in.nextInt();
     for(int i = n+1;i<k;i++){
         if(i%2==0)
         System.out.print(i+" ");
     }
     

}

  
     
}