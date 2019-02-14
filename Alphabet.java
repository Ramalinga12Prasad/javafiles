import java.util.Scanner;

public class Alphabet{
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        String x = in.next();
        if(x.length()>1){
        
        System.out.println("No");
        }
    else{    
        char a = x.charAt(0);
        if(Character.isAlphabetic(a)){
         System.out.println("Alphabet");
        }
        else{
            System.out.println("No");
        }
    }
    }
}