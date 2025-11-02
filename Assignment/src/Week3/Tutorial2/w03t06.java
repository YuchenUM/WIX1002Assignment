/*Write  a  java  program  that  print  the  circumference  of  a  circle.  
The input of the program is diameter. Display the result in three decimal places. (Note  = Math.PI) */

package Week3.Tutorial2;

import java.util.Scanner;

public class w03t06 {
    public static void main(String[] args) {
        double diameter;
        double pi = Math.PI;
        double result;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter diameter: ");
        diameter = input.nextDouble();
        result = pi * diameter;
        System.out.printf("The circumference of the circle is: %.3f\n", result);
    }
}
