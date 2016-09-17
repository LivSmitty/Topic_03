import java.util.Scanner;

/**
 * Created by scott_000 on 9/16/2016.
 */
public class CharacterInArray18_17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a line of character: ");
        String string = input.nextLine();
        char[] stringArray;
        System.out.print("Enter a character to search: ");
        String c = input.nextLine();

        stringArray = string.toCharArray();
        int length = stringArray.length;


        int counter = 0;


        for (int i = 0; i < stringArray.length; i++){
            if (c.charAt(0) == stringArray[i])
            counter++;
        }

        System.out.print(counter);
    }



}