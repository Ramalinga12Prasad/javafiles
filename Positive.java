/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package positive;
import java.util.Scanner;
/**
 *
 * @author Ram
 */
public class Positive {

    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
if(n>0){
    System.out.println("Postive");
}
else if(n<0){
    System.out.println("Negative");
}
else{
    System.out.println("Zero");
}
        
    }
    
}
