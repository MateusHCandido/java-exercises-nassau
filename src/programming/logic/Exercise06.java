package programming.logic;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                Locale.setDefault(Locale.US);
                System.out.print("Enter the total traveled: ");
                double total_Distance = input.nextDouble();
                System.out.print("Gasoline(liters) consumption: ");
                double consumption = input.nextDouble();
                System.out.printf("AVERAGE CONSUMPTION: %.3f km/l", (total_Distance / consumption));
                break;
            } catch (InputMismatchException error) {
                System.out.println("Insertion error. Try again!");
            }
        }
    }
}
