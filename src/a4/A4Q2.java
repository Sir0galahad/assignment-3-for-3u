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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //making a new scanner
        Scanner in = new Scanner(System.in);
        //telling them what the bot does
        System.out.println("This is a bot to convert inches to cm. Please enter a number of inches");
        //next line is the measurment in inches
        double inches = in.nextDouble();
        //converting inches to CM
        double centimeters = 2.54 * inches;
        //giving them the answer
        System.out.println("that equals approximately " + centimeters + "cm");
    }
}
