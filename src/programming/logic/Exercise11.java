package programming.logic;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int duration = 0;

        System.out.print("START: ");
        int start = input.nextInt();
        System.out.print("FINISH: ");
        int finish = input.nextInt();

        if(start < finish){
         duration = finish - start;
        }else {
            duration = 24 - start + finish;
        }

        System.out.println("O JOGO DUROU " + duration + " HORA(S)");
    }
}
