import java.util.Scanner;

class TimeConversion_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an hour in the 24 hour format: ");
        int hours = input.nextInt();
        int time = 0;
        // String str = String.format("%02d%02d", hours);
        //System.out.println(str);

        if (hours > 12) {
            time = (hours - 12);
            System.out.printf(time + ":00");

        } else if (hours <= 12) {
            time = hours;
            System.out.printf(time + ":00");

        }
    }


}
