package programming.logic;

import java.util.Scanner;

public class Exercise16 {

    public static void main(String[] args) {
        double popA;
        double popB;

        double cont = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a Taxa de População do país A: ");
        popA = input.nextDouble();

        System.out.println("Informe a Taxa de População do país B: ");
        popB = input.nextDouble();

        while(popB > popA) {

            popA += (popA * 3) / 100;
            popB += (popB * 1.5) / 100;

            cont++;
        }

        System.out.println("Taxa de Anos da População: " + cont + " anos.");
    }
}
