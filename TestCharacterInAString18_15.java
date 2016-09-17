import java.util.Scanner;

/**
 * Created by scott_000 on 9/16/2016.
 */
public class TestCharacterInAString18_15 {

        public static void main(String[] args) {
           int high = 0;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a word: ");
            String word = input.nextLine();
            System.out.print("Enter a letter in the word: ");
            String c = input.nextLine();
            numberOfCharacters(word, c, high);

        }

        public static void numberOfCharacters(String word, String c, int high) {
            for (int i = 0; i < word.length(); i++) {
                if (word.substring(i, i + 1).equals(c)) high++;
            }
            System.out.print(high);
        }
}
