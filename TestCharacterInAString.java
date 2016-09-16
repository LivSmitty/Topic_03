
import java.util.Scanner;

/**
 * Created by scott_000 on 9/14/2016.
 */

public class TestCharacterInAString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        System.out.print("Enter a letter in the word: ");
        String c = input.nextLine();
        numberOfCharacters(word, c);

    }

    public static void numberOfCharacters(String word, String c) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.substring(i, i + 1).equals(c)) count++;
            }
            System.out.print(count);
    }
}

