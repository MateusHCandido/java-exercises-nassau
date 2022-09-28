package programming.logic;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cod;
        double renda = 0, consumo = 0, pagamento = 0, valor = 0;


		System.out.println("Digite na tela os seguintes números: \n");
		System.out.println("1 - Sobre o Bairro de Santa Ana ");
		System.out.println("2 - Sobre o Bairro de Industriários ");
		System.out.println("3 - Sobre o Bairro de Santa Ana \n");
		System.out.println("Não digite outro número: \n");

		System.out.println("Informe o código do bairro: ");
    cod = input.nextInt();

		if(cod > 3 || cod < 1) {

        System.out.println("Stop");
    }

		switch (cod) {

        case 1:

            System.out.println("Bairro de Santa Ana: ");

            System.out.println("Informe a renda: ");
            renda = input.nextDouble();

            System.out.println("Informe o consumo: ");
            consumo = input.nextDouble();



            if(renda >= 50 && renda <= 500) {

                if (consumo < 0) {

                    System.out.println("Interromper");
                    break;
                }

                double desconto = 50;

                pagamento = consumo - desconto;

            } else if(renda >= 500 && renda <= 1000 ) {

                if (consumo < 0) {

                    System.out.println("Interromper");
                    break;
                }

                double desconto = 25;
                pagamento = consumo - desconto;

            }

            System.out.printf("Valor do Pagamento com desconto é: %.2f ", pagamento);

            break;

        case 2:

            System.out.println("Bairro de Industriários: ");

            System.out.println("Informe a renda: ");
            renda = input.nextDouble();

            System.out.println("Informe o consumo: ");
            consumo = input.nextDouble();

            if(renda >= 240 && renda <= 1000) {

                if (consumo < 0) {

                    System.out.println("Interromper");
                    break;
                }

                double desconto = 240;
                pagamento = consumo - desconto;


            } else if(renda >= 1000 && renda <= 5000) {

                if (consumo < 0) {

                    System.out.println("Interromper");
                    break;
                }

                double desconto = 120;
                pagamento = consumo - desconto;

            }

            System.out.println("Valor do Pagamento com desconto é:  " + pagamento);

            break;

        case 3:

            System.out.println("Bairro de Tabatinga: ");

            System.out.println("Informe a renda: ");
            renda = input.nextDouble();

            System.out.println("Informe o consumo: ");
            consumo = input.nextDouble();

            if(renda >= 5000) {

                if (consumo < 0) {

                    System.out.println("Interromper");
                    break;
                }

                double desconto = 720;
                pagamento = consumo - desconto;


            } else if(renda <= 20000) {

                if (consumo < 0) {

                    System.out.println("Interromper");
                    break;
                }

                double desconto = 360;
                pagamento = consumo - desconto;

            }

            System.out.println("Valor do Pagamento com desconto é:  " + pagamento);

            break;
        }

    }
}
