package programming.logic;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first feature");
        String sentence1 = input.next();
        System.out.print("Enter the second feature");
        String sentence2 = input.next();
        System.out.print("Enter the third feature");
        String sentence3 = input.next();
        if (sentence1.equalsIgnoreCase("vertebrado")) {
            if (sentence2.equalsIgnoreCase("ave")) {
                if (sentence3.equalsIgnoreCase("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if (sentence3.equalsIgnoreCase("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }
        } else {
            if (sentence2.equalsIgnoreCase("inseto")) {
                if (sentence3.equalsIgnoreCase("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else {
                if (sentence3.equalsIgnoreCase("hematofago")) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }
    }
}
