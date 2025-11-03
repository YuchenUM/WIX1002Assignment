/*Write a program that calculates the energy needed to heat water.  
Q = M * (final temperature – initial temperature) * 4184 
M = Weight of water in kg 
Q = Energy in joules 
The temperature are in degree Celsius  */

package Week3.Lab2;

import java.util.Scanner;

public class w03l06 {
    public static void main(String[] args) {
        double gram, initialFah, finalFah, initialCel, finalCel, joules;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in gram: ");
        gram = input.nextDouble();
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        initialFah = input.nextDouble();
        System.out.print("Enter the final temperature in Fahrenheit: ");
        finalFah = input.nextDouble();

        initialCel = (initialFah - 32.0) / 1.8;
        finalCel = (finalFah - 32.0) / 1.8;
        joules = gram * 0.001 * (finalCel - initialCel) * 4184.0;
        System.out.printf("The energy needed is %.6e", joules);
    }
}
