/*Write  a  java  program  that  converts  inches  to  meters.  
(Given  1  inch  equals  to  2.54 centimeters). 
Print the output in two decimal places. */

package Week3.Tutorial2;

import java.util.Scanner;

public class w03t07 {
    public static void main(String[] args) {
        double inch, meter;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter value in inch: ");
        inch = input.nextDouble();
        meter = inch * 2.54 * 0.01;
        System.out.printf("%.2f inches = %.2f meters\n", inch, meter);
    }
}
