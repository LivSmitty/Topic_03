import java.util.Scanner;

/**
 * Created by scott_000 on 9/15/2016.
 */
public class Chapter4_02 {
    public static void main(String[] args) {

        //Calculate Great Circle distance
        Scanner input = new Scanner(System.in);
        System.out.print("Enter point 1 (Latitude and Longitude: ");
        double lat1 = input.nextDouble();
        double long1 = input.nextDouble();
        System.out.print("Enter point 2 (Latitude and Longitude: ");
        double lat2 = input.nextDouble();
        double long2 = input.nextDouble();

        //Convert Latitude and Longitude to Radians
        lat1 = Math.toRadians(lat1);
        long1 = Math.toRadians(long1);
        lat2 = Math.toRadians(lat2);
        long2 = Math.toRadians(long2);

        double radius = 6371.01;
        double distance = (radius * (Math.acos(Math.sin(lat1)) * Math.sin(lat2)) + Math.cos(lat1) * (Math.cos(lat2) * Math.cos(long1 - long2)));

        System.out.print("The distance between the two points is: " + distance);
    }
}
