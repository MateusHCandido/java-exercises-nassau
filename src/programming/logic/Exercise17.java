package programming.logic;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);

    int n;
    int a, b, d;
    int cont;

		System.out.println("Informe um número: ");
    n = input.nextInt();

		for(a = 0; a < n; a++) {

            cont = 1;

            System.out.println("Informe um outro número: ");
            b = input.nextInt();

            for (d = 2; d < b; d++) {

                if (b % d == 0) {

                    cont++;
                }
            }

            if (cont == 1 && b != 1) {

                System.out.println("O número: " + b + " é primo");

            } else {

                System.out.println("O número: " + b + " não é primo");
            }
        }
    }
}
