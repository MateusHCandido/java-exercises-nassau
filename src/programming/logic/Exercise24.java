package programming.logic;

import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int primeiro, segundo, terceiro, quarto, quinto, valor;
        System.out.println("Informe um valor: ");
        valor = input.nextInt();

        if(valor < 10000 && valor > 99999) {

            System.out.println("Valor inválido, Informe um número correto: ");
            valor = input.nextInt();
        }

        quinto = valor % 10;
        valor /= 10;

        quarto = valor % 10;
        valor /= 10;

        terceiro = valor % 10;
        terceiro += 10;
        valor /= 10;

        segundo = valor % 10;
        valor /= 10;

        primeiro = valor % 10;

        if(primeiro == quinto && segundo == quarto) {

            System.out.println("Sim");

        } else {

            System.out.println("Não");
        }
    }
}
