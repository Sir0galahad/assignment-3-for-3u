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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner
        Scanner in = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = in.nextLine();
        //giving instructions
        System.out.println("please enter what each test was out of and what mark you got on separate lines.");
        //accepting the marks
        double oneT = in.nextDouble();
        double oneM = in.nextDouble();
        double twoT = in.nextDouble();
        double twoM = in.nextDouble();
        double threeT = in.nextDouble();
        double threeM = in.nextDouble();
        double fourT = in.nextDouble();
        double fourM = in.nextDouble();
        double fiveT = in.nextDouble();
        double fiveM = in.nextDouble();

        //finding percent on each test
        double pone = oneM / oneT * 100;
        double ptwo = twoM / twoT * 100;
        double pthree = threeM / threeT * 100;
        double pfour = fourM / fourT * 100;
        double pfive = fiveM / fiveT * 100;

        //finding overall average
        double total = pone + ptwo + pthree + pfour + pfive;
        double average = total / 5;
        //outputting the information
        System.out.println(name + " your mark on each test is as follows " + pone + " " + ptwo + " " + pthree + " " + pfour + " " + pfive);
        System.out.println(name + " Your final average is " + average);

    }
}
