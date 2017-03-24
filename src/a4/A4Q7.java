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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //setting up scanner and the player integer
        Scanner in = new Scanner(System.in);
        int player = 1;
        //welcoming and telling them how to quit
        System.out.println("Welcome to snakes and ladders presented by curtis miller");
        System.out.println("if you want to quit please type 0");
        //starting the loop
        while (player < 100) {
            System.out.println("please enter what you rolled it should be between 2-12");

            int roll = in.nextInt();
            //allowing them to quit
            if (roll == 0) {
                System.out.println("aww okay please play again some other time");
                break;
            }
            //actually advancin the player
            player = player + roll;
            //setting up the snakes and ladders
            if (player == 54) {
                player = 19;
                System.out.println("Oh no you hit a snake and fall all the way back to place 19");
            }
            if (player == 90) {
                player = 48;
                System.out.println("Oh no you hit a snake and fall all the way back to place 48");
            }
            if (player == 99) {
                player = 77;
                System.out.println("Oh no you hit a snake and fall all the way back to place 77");
            }
            if (player == 9) {
                player = 34;
                System.out.println("Yay you hit a ladder and got put up to 34");
            }
            if (player == 40) {
                player = 64;
                System.out.println("Yay you hit a ladder and got put up to 64");
            }
            if (player == 67) {
                player = 86;
                System.out.println("Yay you hit a ladder and got put up to 86");
            }
            //letting the player know their location
            System.out.println("you are currently on space " + player);
        }
        //win condition
        if (player > 99) {
            System.out.println("Congrats you won yaaaay!");
        }
    }
}
