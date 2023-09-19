/*

2. Create a program to display an integer variable (the integer value must be declared). This
variable will contain a random value from 0.0 to 9.999999 and will be multiplied by PI. Once
displayed, add 70 to this number using an assignment operator and assign it to a char variable.
Display this char variable, and by using an unary operator its follower one)

 */

package exercises;

public class Exercise2 {
    public static void main(String[] args) {

        int number = (int) (Math.random() * 10 * Math.PI);
        System.out.println("The first number is: " + number);

        number += 70;

        char character1 = (char) number;
        char character2 = character1--;

        System.out.println("The resulting character is: " + character1);
        System.out.println("The next resulting character is: " + character2);

    }
}
