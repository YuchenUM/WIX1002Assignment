/*Write a program that convert the temperature in degree Fahrenheit to degree Celsius. 
The program will display the degree Celsius in two decimal places.  
Celsius = (Fahrenheit – 32) / 1.8 
*/

package Week3.Lab2;

import java.util.Scanner;

public class w03l01 {
    public static void main(String[] args) {
        double fah, cel;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in degree Fahrenheit: ");
        fah = input.nextDouble();
        cel = (fah - 32.0) / 1.8;
        System.out.printf("In degree Ceksius: %.2f\n", cel);
    }
}
