package programming.logic;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert a value: ");
        int N = input.nextInt();
        int next, preceding = 0, actually = 1;
        for (int i = 1; i <= N; i++) {
            if (i == N) System.out.println(preceding);
            else System.out.print(preceding + " ");
            next = preceding + actually;
            preceding = actually;
            actually = next;
        }
    }
}
