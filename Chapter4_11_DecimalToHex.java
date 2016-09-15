/**
 * Created by scott_000 on 9/15/2016.
 */


import java.util.Scanner;

public class Chapter4_11_DecimalToHex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer between 0 and 15:");
        int num = input.nextInt();

        //Verify num is <= 15
        if (num <= 15) {
            String hexString = Integer.toHexString(num);
            System.out.println("The hex value of integer " + num + " is " + hexString);
        }else
            System.out.println("Incorrect value. ");

        }

    }



