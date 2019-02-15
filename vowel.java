import java.util.Scanner;

public class vowel{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String x = in.next();
        if(x.length()>1){
        
        System.out.println("invalid");
        }
    else{    
        char a = x.charAt(0);
        if(Character.isAlphabetic(a)){
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
                System.out.println("Vowel");
            }
            else{
                System.out.println("Consonant");
            }
        }
        else{
            System.out.println("invalid");
        }
    }

    }
}
