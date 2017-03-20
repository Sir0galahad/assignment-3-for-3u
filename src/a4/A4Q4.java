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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner
        Scanner in = new Scanner(System.in);
        //telling people how to use it
        System.out.println("this program will calculate the total cost for a party as well as total number of tickets sold.");
        //each of these is finding out how much they are spending on something
        System.out.println("How much are you spending on food?");
        double food = in.nextDouble();
        System.out.println("How much does it cost for the DJ?");
        double dj = in.nextDouble();
        System.out.println("How much is it to rent the location?");
        double space = in.nextDouble();
        System.out.println("How much does it cost for decorations?");
        double deco = in.nextDouble();
        System.out.println("How much is it costing for staff?");
        double staff = in.nextDouble();
        System.out.println("How much for MISC things?");
        double misc = in.nextDouble();
        System.out.println("how much are you charging for a ticket?");
        double ticket = in.nextDouble();
        //adding them together into a total
        double total = food + dj + space + deco + staff + misc;
        //finding out how many tickets they need to sell
        double sold = total / ticket;
        //telling them the actual numbers and thanking them
        System.out.println("Your total cost is $" + total + " and you need to sell " + sold + " tickets.");
        System.out.println("Thank you for using this bot.");
    }
}
