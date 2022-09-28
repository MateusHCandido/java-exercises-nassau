package programming.logic;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y;
        System.out.println("Informe o valor de x: ");
        x = input.nextInt();
        System.out.println("Informe o valor de y: ");
        y = input.nextInt();
        if(x > y) {
            System.out.println("Valor verdadeiro:  " + 1);
        } else {
            System.out.println("Valor Falso: " + 0);
        }
        if(x == y) {
            System.out.println("Valor Verdadeiro: " + 1);
        } else {
            System.out.println("Valor Falso: " + 0);
        }
        if(x < y) {
            System.out.println("Valor Verdadeiro: " + 1);
        } else {
            System.out.println("Valor Falso: " + 0);
        }
        if(x != y) {
            System.out.println("Valor Verdadeiro: " + 1);
        } else {
            System.out.println("Valor Falso: " + 0);
        }

        if(x >= y) {
            System.out.println("Valor Verdadeiro: " + 1);
        } else {
            System.out.println("Valor Falso: " + 0);
        }
        if(x <= y) {
            System.out.println("Valor Verdadeiro: " + 1);
        } else {
            System.out.println("Valor Falso: " + 0);
        }


    }
}
