/*

5. Modify exercise one so that an error is displayed if the user selects a wrong letter.
For example:

Introduce a word:

Hello

Select the letter to display

-2

You have to select a position between 1 and 5

 */

package exercises;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce a word: ");
        String word = sc.next();

        System.out.print("Select the letter to display: ");
        int letterNumber = sc.nextInt();

        while (letterNumber < 1 || letterNumber > word.length()) {

            System.out.println("You have to select a position between 1 and " + word.length());

            System.out.print("Select the letter to display: ");
            letterNumber = sc.nextInt();
        }

        char wordSelected = word.charAt(letterNumber - 1);
        System.out.println("The word selected is the letter: " + wordSelected);

    }
}
