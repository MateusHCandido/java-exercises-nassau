package programming.logic;

import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] requisitos = new int[5];

        for(int i = 0; i < requisitos.length; i++) {
            System.out.printf("Informe o [%d] registro: ", i);
            requisitos[i] = input.nextInt();
            if(requisitos[i] < 0 || requisitos[i] > 1) {
                System.out.println("Inválido");
                break;
            }
        }
        if( requisitos[2] == 1) {
            System.out.println("Avaliados");
        } else {
            System.out.println("0 (Zero)");
        }

    }
}
