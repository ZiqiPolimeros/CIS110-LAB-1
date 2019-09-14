/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinput;

import java.util.Scanner;

/**
 *
 * @author ziqi.wu
 */
public class UserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        int y;
        int z;
        System.out.println("Give the first int.");
        x=in.nextInt();
        System.out.println("Give the second int.");
        y=in.nextInt();
        z=x+y;
        System.out.println(z);
    }
}
