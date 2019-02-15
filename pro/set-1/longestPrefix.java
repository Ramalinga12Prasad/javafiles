import java.util.Scanner;
public class longestPrefix{
    public static void main(String args[]) {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     String x[] =new String[n];
     String finalOutput ="";
     int minLength=Integer.MAX_VALUE;
     for(int i=0;i<n;i++){
         x[i] = in.next();
         minLength = Math.min(minLength,x[i].length());
     }
     for(int i=0;i<minLength;i++){
        char z = x[0].charAt(i);
        int count =0;
        for(int j=0;j<x.length;j++){
            if(x[j].charAt(i)==z){
                count++;
            }

        }
        if(count==x.length)
        finalOutput+=String.valueOf(z);
        else
        break;


     }
     System.out.println(finalOutput);
    }
     

}

  
     
