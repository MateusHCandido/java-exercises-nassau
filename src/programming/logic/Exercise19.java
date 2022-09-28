package programming.logic;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salarioAtual;
        double novoSalario;

        System.out.println("Informe o salário do funcionário: ");
        salarioAtual = input.nextDouble();

        if(salarioAtual >= 500.00) {

            novoSalario = salarioAtual + (salarioAtual * 10) / 100;

        } else if(salarioAtual >= 300.00) {

            novoSalario = salarioAtual +  (salarioAtual * 7) / 100;

        } else {

            novoSalario = salarioAtual +  (salarioAtual * 5) / 100;
        }

        System.out.printf("O Salário do funcionário é de: %.2f", novoSalario);
    }
}
