package programming.logic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int larger = 0, smaller = 0;
        try {
            System.out.print("Insert a first value: ");
            int v1 = input.nextInt();
            System.out.print("Insert a second value: ");
            int v2 = input.nextInt();
            System.out.print("Insert a third value: ");
            int v3 = input.nextInt();
            if (v1 > v2 && v1 > v3 && v2 > v3) {
                larger = v1;
                smaller = v3;
            } else if (v2 > v1 && v2 > v3 && v1 > v3) {
                larger = v2;
                smaller = v3;
            } else {
                larger = v1;
                smaller = v2;
            }
        }catch (InputMismatchException error){
            System.out.println("Error: " + error.getMessage());
        }
        System.out.println("LARGER: " + larger);
        System.out.println("SMALLER: " + smaller);

    }
}
