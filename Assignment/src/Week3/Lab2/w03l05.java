/*Write a program that generates one random number.  The range of the random 
number is 0 to 10000. Display the number and the sum of all the digits in the number.  */

package Week3.Lab2;

public class w03l05 {
    public static void main(String[] args) {
        int randomNum = (int) (Math.random()*10001);
        int num1, num2, num3, num4, num5, sum;
        num1 = randomNum % 10;
        num2 = randomNum % 100 / 10;
        num3 = randomNum % 1000 / 100;
        num4 = randomNum % 10000 / 1000;
        num5 = randomNum / 10000;
        sum = num1 + num2 + num3 + num4 + num5;

        System.out.println("The random number is: " + randomNum);
        System.out.println("The sum of all digits: "+ sum);
    }
}
