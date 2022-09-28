package programming.logic;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insert your age in days: ");
        int ageInDays = input.nextInt();

        int ages = ageInDays / 365;
        int months = (ageInDays % 365) / 30;
        int days = (ageInDays % 365) % 30;

        System.out.printf("%d ano(s)%n%d mês(es)%n%d dia(s)", ages, months, days);

    }
}
