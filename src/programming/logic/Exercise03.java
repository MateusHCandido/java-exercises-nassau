package programming.logic;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("ENTER NAME: ");
            String name = input.next();
            System.out.print("ENTER YOUR FIXED SALARY: ");
            double fixed_salary = input.nextDouble();
            System.out.print("ENTER YOUR TOTAL IN SALES: ");
            double total_sales = input.nextDouble();
            double total_value = commissionCalculation(fixed_salary, total_sales);
            System.out.println("TOTAL = R$ " + String.format("%.2f", total_value));
        }catch (InputMismatchException error){
            System.out.println("data insertion error: " + error.getMessage());
        }
    }

    public static double commissionCalculation(double fixed_salary, double total_sales){
        double percent = 15;
        return fixed_salary + (total_sales * percent)/100;
    }
}
