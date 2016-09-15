import java.util.Scanner;

/**
 * Created by scott_000 on 9/13/2016.
 */

public class TestCheckPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password (8 characters long, with at least 2 digits): ");
        String password = input.next();

        if (CheckPassword.validateLength(password) == false) {
            System.out.println("Invalid Password");
        }else if (CheckPassword.validateLettersAndNumbers(password) == false) {
            System.out.println("Invalid Password");
        }else if (CheckPassword.validateTwoDigits(password) == false) {
            System.out.println("Invalid Password");
        }
        else
            System.out.println("Your password is valid.");


    }
}
