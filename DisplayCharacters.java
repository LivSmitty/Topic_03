/**
 * Created by scott_000 on 9/13/2016.
 */
public class DisplayCharacters {

    public static void printChars(char ch1, char char2, int numberPerLine) {
        //Print Random Numbers
        int numberOfChars = 175;

        for (int i = 0; i < numberOfChars; i++) {
            char ch = DisplayCharacters.getRandomDigitOrLetter();
            if ((i + 1) % numberPerLine == 0) {
                System.out.println(ch);
            }else{
                System.out.print(ch + " ");
            }
        }
    }


    //Generate a random character between ch1 and ch2
    public static char getRandomCharacter(char ch1, char ch2){
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    //Generate a random lowercase letter
    public static char getRandomLowerCaseLetter(){
        return getRandomCharacter('a', 'z');
    }

    //Generate a random UPPERCASE letter
    public static char getRandomDigitOrLetter() {
        return getRandomCharacter('1', 'Z');
    }

    //Generate a random digit character
    public static char getRandomDigitCharacter(){
        return getRandomCharacter('0', '9');
    }

    //Generate a random character
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}
