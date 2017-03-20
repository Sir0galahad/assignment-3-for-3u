/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a4;

import java.util.Scanner;

/**
 *
 * @author millc9988
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner
        Scanner in = new Scanner(System.in);
        //asking them to input name
        System.out.println(" Hello, what is your name?");
        //next thing they type is their name
        String name = in.nextLine();
        //greet them by name
        System.out.println("hello " + name);
    }
}
