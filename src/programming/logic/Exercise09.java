package programming.logic;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value to represent seconds: ");
        int seconds_INPUT = input.nextInt();

        int hour = seconds_INPUT / 3600;
        int module = seconds_INPUT % 3600;
        int minutes = module / 60;
        int seconds = module % 60;

        System.out.printf("HH:MM:SS = %d:%d:%d", hour, minutes, seconds);
    }
}
