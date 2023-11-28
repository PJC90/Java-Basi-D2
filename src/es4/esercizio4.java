package es4;

import java.util.Scanner;

public class esercizio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero e premi invio");
        int input = scanner.nextInt();
        scanner.close();
        System.out.println("hai scritto"+ input);
        System.out.println("conto alla rovescia:");
        for (int i = input; i>=0; i--){
            System.out.println(i);
        }
    }
}
