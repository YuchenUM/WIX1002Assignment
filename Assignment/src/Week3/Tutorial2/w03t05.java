/*Correct the error for the following statements. 
a.  final double AMOUNT = "32.5"; AMOUNT += 10; System.out.println("The amount is " + AMOUNT);  
b.  string chapter = 'Summary'; System.out.println(chapter);  
c.  int num; ++num++; num1 = num;  
d.  int num = 3000; System.out.printf("%4.2f\n", num);   
e.  String contact; Scanner keyboard = new Scanner(System.out); contact = keyboard.nextLine(); */

package Week3.Tutorial2;

import java.util.Scanner;

public class w03t05 {
    public static void main(String[] args) {
        //a.
        double AMOUNT = 32.5;
        AMOUNT += 10;
        System.out.println("The amount is " + AMOUNT);
        //b.
        String chapter = "Summary"; 
        System.out.println(chapter);
        //c.
        int num = 0; 
        ++num;
        num++;
        int num1 = num;
        //d.
        int num0 = 3000; 
        System.out.printf("%4.2f\n", (float)num0);
        //e.
        String contact; 
        Scanner keyboard = new Scanner(System.in); 
        contact = keyboard.nextLine();
    }
}
