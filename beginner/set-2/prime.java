import java.util.Scanner;
public class prime{
    public static void main(String args[]) {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int count =0;
     int k = n;
     while(k>0)
    {   
        if(n%k-- == 0)
        count++;

    }
    if(count ==2)
    System.out.println("yes");
    else
    System.out.println("no");


}

  
     
}