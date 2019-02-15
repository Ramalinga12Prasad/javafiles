import java.util.Scanner;
public class primeIntervals{
    public static void main(String args[]) {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int k = in.nextInt();
     for(int i = n+1;i<k;i++){
          int count =0;
     int z = i;
     while(z>0)
    {   
        if(i%z-- == 0)
        count++;

    }
    
         if(count==2)
         System.out.print(i+" ");
     }
     

}

  
     
}