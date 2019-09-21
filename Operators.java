package Operators;
import java.util.Scanner;
public class Operators{
    public static void main(String[] args) {
        System.out.println("How many feet tall are you?"); 
        Scanner in = new Scanner(System.in);
        int x;
        int y;
        double z;        
        x=in.nextInt();
        System.out.println("How many inches are you?");
        y=in.nextInt();
        z=(x*12+y)*2.54;
        System.out.println("You are "+z+"centimeters!");
        
     
    }
    
}
