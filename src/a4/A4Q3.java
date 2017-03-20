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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner
        Scanner in = new Scanner(System.in);
        //giving user instructions
        System.out.println("please enter four numbers on seperate lines");
        //setting up the inputs
        double first = in.nextDouble();
        double second = in.nextDouble();
        double third = in.nextDouble();
        double fourth = in.nextDouble();
        //giving outputs
        System.out.println(first + ", " + second + ", " + third + ", " + fourth);
    }
}
