/*Write a program that converts the seconds to hours, minutes and seconds.  */

package Week3.Lab2;

import java.util.Scanner;

public class w03l04 {
    public static void main(String[] args) {
        int raw, hours, minutes, seconds;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        raw = input.nextInt();

        hours = raw / 3600;
        minutes = raw % 3600 / 60;
        seconds = raw % 60;
        System.out.println(raw + " seconds is " + hours + " hours " + minutes + " minutes dan " + seconds + " seconds");
    }
}
