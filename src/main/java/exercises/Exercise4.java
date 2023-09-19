/*

4. Create a program that indicates if a number entered by keyboard is positive,
negative or zero.

 */

package exercises;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("The number entered is positive");

        } else if (number < 0) {
            System.out.println("The number entered is negative");

        } else {
            System.out.println("The number entered is zero");
        }

    }
}
