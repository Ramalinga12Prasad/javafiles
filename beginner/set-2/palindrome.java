import java.util.Scanner;
public class palindrome{
    public static void main(String args[]) {
     Scanner in = new Scanner(System.in);
    String x = in.next();
    StringBuffer sb = new StringBuffer(x);
     sb =sb.reverse();
     
    
     
     if(sb.toString().equals(x))
     System.out.println("yes");
     else
     System.out.println("no");
    }
  
    
}