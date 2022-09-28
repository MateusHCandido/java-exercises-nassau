package programming.logic;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int banknotes100 = 0, banknotes50 = 0, banknotes20 = 0, banknotes10 = 0,banknotes05 = 0, banknotes02 = 0,banknotes01 = 0;
        try {
            System.out.print("Insert a value US$ ");
            int totalValue = input.nextInt();
            ballotCounting(totalValue, banknotes100, banknotes50, banknotes20, banknotes10,banknotes05, banknotes02,banknotes01);
        }catch (InputMismatchException error){
            System.out.println("Illegal value: " + error.getMessage());
        }
    }

    public static void ballotCounting(int totalValue, int banknotes100, int banknotes50,int  banknotes20, int banknotes10,
                                      int banknotes05, int  banknotes02, int banknotes01)
    {
        banknotes100 = totalValue/100;
        totalValue -= banknotes100 * 100;

        banknotes50 = totalValue/50;
        totalValue -= banknotes50  * 50;

        banknotes20 = totalValue/20;
        totalValue -= banknotes20 * 20;

        banknotes10 = totalValue/10;
        totalValue -= banknotes10 * 10;

        banknotes05 = totalValue/5;
        totalValue -= banknotes05 * 5;

        banknotes02 = totalValue/2;
        totalValue -= banknotes02 * 2;

        banknotes01 = totalValue;

        Locale.setDefault(Locale.US);
        System.out.println(banknotes100 + "bill(s) of $100.00");
        System.out.println(banknotes50 + "bill(s) of $50.00");
        System.out.println(banknotes20 + "bill(s) of $20.00");
        System.out.println(banknotes10 + "bill(s) of $10.00");
        System.out.println(banknotes05 + "bill(s) of $5.00");
        System.out.println(banknotes02 + "bill(s) of $2.00");
        System.out.println(banknotes01 + "bill(s) of $1.00");
    }


}
