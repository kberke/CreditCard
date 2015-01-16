/**
 * Created by kberke on 1/16/15.
 */
import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Credit Card Number");
        String s = input.nextLine();
        System.out.println("The Credit Card Number you entered is " + s);

        new CreditCard().validate(s);
    }

    public void validate(String CreditCardNumber) {

        if (CreditCardNumber.matches("[0-9]+") == false) {
            System.out.println("Credit Card number is invalid and contains special characters or letters.");
        } else if (CreditCardNumber.length() < 14) {
            System.out.println("Credit Card number length is invalid. Credit Card is " + (14 - CreditCardNumber.length()) + " numbers too short.");
        } else if (CreditCardNumber.length() > 18) {
            System.out.println("Credit Card number length is invalid. Credit Card is " + (CreditCardNumber.length() - 18) + " numbers too long.");
        } else {
            System.out.println("Credit Card Valid");
        }
    }
}
