import java.util.Scanner;

/**
 * Created by scott_000 on 9/15/2016.
 */

public class TimeConversion_2 {
    public static void main(String[] args) {
        //Get time (in decimal format) from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a time in decimal format (i.e. 4.50): ");
        String string = input.nextLine();

        //Split the decimal at the period, assign each string a variable name.
        String[] parts = string.split("\\.");
        String part1 = parts[0];
        String part2 = parts[1];

        //Convert time to minutes
        int minutes = (Integer.parseInt(parts[1]));
        System.out.println("The time in minutes is: " + parts[0] + " hours and " + ((minutes * 6)/10) + " minutes.");



    }
}

