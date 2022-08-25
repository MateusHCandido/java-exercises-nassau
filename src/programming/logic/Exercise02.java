package programming.logic;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double salary = 0d;
        while(true) {
            try {
                System.out.print("ID: ");
                int id = input.nextInt();
                System.out.print("Hours worked: ");
                int hours_w = input.nextInt();
                System.out.print("Hourly value: ");
                double hourly_v = input.nextDouble();
                salary = calcultateSalary(hours_w, hourly_v);
                if (salary <= 0){
                    System.out.println("Data cannot be validated. Try again");
                }else{
                    System.out.println("NUMBER = " + id);
                    System.out.println("SALARY = R$" + String.format("%.2f", salary));
                    break;
                }
            } catch (InputMismatchException error) {
                System.out.println("Inconsistent data. Try again!");
            }
        }
    }


    public static double calcultateSalary(int hours_worked, double horly_value){
        return horly_value * hours_worked;
    }
}
