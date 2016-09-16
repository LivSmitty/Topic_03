/**
 * Created by scott_000 on 9/15/2016.
 */

public class TimeConversion_2 {
    public static void main(String[] args) {
        String string = "4.50";
        String[] parts = string.split("\\.");
        String part1 = parts[0];
        String part2 = parts[1];
        System.out.println(parts[0]);
        System.out.println(parts[1]);

        int minutes = (Integer.parseInt(parts[1]));
        System.out.println(parts[0] + " hours and " + ((minutes * 6)/10) + " minutes.");



    }
}

