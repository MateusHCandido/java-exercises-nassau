package programming.logic;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Double MI = null, WI = null, JI = null; //man's income, woman's income and joint income
        double tax = 0d;
        try {
            System.out.print("Enter the man's income: U$ ");
            MI = input.nextDouble();
            System.out.print("Enter the woman's income: U$ ");
            WI = input.nextDouble();
            JI = jointIncome(MI, WI);
            tax = aliquot(JI);

        } catch (IllegalArgumentException error) {
            System.out.println("error 01: illegal passing of arguments");
        } catch (InputMismatchException error) {
            System.out.println("error 02: invalid values");
        } catch (NullPointerException error) {
            System.out.println("error 03: empty fill field");
        }finally {
            System.out.println("===========SUMMARY===========");
            System.out.println("JOINT INCOME US$ " + String.format("%.2f",JI ));
            System.out.println("USED RATE: " + String.format("%.0f%%", (tax * 100)));
            System.out.println("INCOME TAX: U$ " + String.format("%.2f", taxAmount(JI, tax)));
            System.out.println("NET INCOME: U$ " + String.format("%.2f", netIncome(JI, tax)));
        }
    }


    public static Double netIncome(Double JI, Double tax){
        return JI - (taxAmount(JI, tax));
    }


    public static Double jointIncome(Double WI, Double MI){
        return WI + MI;
    }


    public static Double taxAmount(Double JI, Double tax){
        return JI * tax;
    }


    public static Double aliquot (Double JI){
        double tax = 0;
        if (JI >= 0 && JI <= 900d) {
            tax = 0.1;
        } else if (JI > 900d && JI <= 1500d) {
            tax = 0.10;
        } else if (JI > 1500d && JI <= 2500d) {
            tax = 0.15;
        } else if (JI > 2500d) {
            tax = 0.25;
        }
        return tax;
    }
}
