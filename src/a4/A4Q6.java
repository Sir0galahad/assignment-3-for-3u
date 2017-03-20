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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //obtaining data about speed and limit
        System.out.println("please enter speed limit.");
        int limit = in.nextInt();
        System.out.println("now please enter what speed you were travelling at.");
        int speed = in.nextInt();

        //determining how far over if at all they are
        int over = speed - limit;
        
        //giving them info based on how over the speed limit they are
        if (over < 1) {
            System.out.println("congrats you are fine");
        }
        if (over > 0 && over < 21) {
            System.out.println("you are speeding and your fine is $100");
        }
        if (over > 20 && over < 31) {
            System.out.println("you are speeding and your fine is $270");
        }
        if (over > 30) {
            System.out.println("you are speeding and your fine is $500");
        }
    }
}
