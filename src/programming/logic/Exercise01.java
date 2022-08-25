package programming.logic;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        double p1 = 3.5, p2 = 7.5, average = 0.0;
        Scanner input = new Scanner(System.in);
        while(true) {
            try {
                System.out.print("Enter the value of the first note: ");
                double n1 = input.nextDouble();
                System.out.print("Enter the value of the second note: ");
                double n2 = input.nextDouble();
                average = weightedAverage(p1, p2, n1, n2);
                Locale.setDefault(Locale.US);
                System.out.println("AVERAGE: " + String.format("%.2f", average));
                break;
            } catch (InputMismatchException inputExcepction) {
                System.out.println("ERROR 01: INSERT A DECIMAL VALUE");
            }
        }
        input.close();
    }


    public static double weightedAverage(double p1, double p2, double v1, double v2){
        double result = ((p1 * v1) + (p2 * v2))/(p1+p2);
        if (result > 10){
            return 10d;
        }else{
            return result;
        }

    }
}
