/*

3. Create a program that simulates a coin toss using Math.random(). The program
should show odd and even randomly.

 */

package exercises;

public class Exercise3 {
    public static void main(String[] args) {

        int number = (int) (Math.random()*2);

        if (number == 0) {
            System.out.println("The result is even");

        } else {
            System.out.println("The result is odd");
        }

    }
}
