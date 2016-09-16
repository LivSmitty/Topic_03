import java.util.Scanner;

public class CharacterInAString {

    public static void main(String[] args) {

        //Get word and character from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = input.nextLine();
        System.out.println("Enter a character to find: ");
        String c = input.next();

        //determine word length

        if (s.contains(c))
            System.out.print("Yes");
        else
            System.out.print("no");



    }
}