/*

1. Create a program to display the selected position of a letter (number entered by the console)
within a word (entered also by keyboard). For example:

Introduce a word:

Hello

Select the letter to display

2

The word selected is the letter:  e

 */

package exercises;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce a word: ");
        String word = sc.next();

        System.out.print("Select the letter to display: ");
        int letterNumber = sc.nextInt();

        char wordSelected = word.charAt(letterNumber - 1);
        System.out.println("The word selected is the letter: " + wordSelected);

    }
}
