package programming.logic;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int maiorAno = 0;
        double maiorVlc = 0;
        int[] ano = new int[4];
        double[] velocidade = new double[4];
        int i;

        for(i = 1; i < ano.length; i++) {
            System.out.printf("Informe o [%d] ano do seu carro novo: ", i, ano[i]);
            ano[i] = input.nextInt();
            System.out.printf("Informe a [%d] velocidade do seu carro novo: ", i, velocidade[i]);
            velocidade[i] = input.nextDouble();

            if(ano[i] > maiorAno) {
                maiorAno = ano[i];
            }
            if(velocidade[i] > maiorVlc) {
                maiorVlc = velocidade[i];
            }
        }
        System.out.printf("O Maior ano do seu carro é: [%d] \n", maiorAno);
        System.out.printf("A Maior Velocidade do seu carro é de: [%.2f] \n", maiorVlc);
    }
}
