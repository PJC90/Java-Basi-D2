package es2;

import java.util.Scanner;

public class esercizio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero");
        int numero = scanner.nextInt();
        switch (numero){
            case 0:
                System.out.println("il numero è zero");
                break;
            case 1:
                System.out.println("il numero è uno");
                break;
            case 2:
                System.out.println("il numero è due");
                break;
            case 3:
                System.out.println("il numero è tre");
                break;
            default:
                System.out.println("Ritenta, il numero è troppo grande!");
                break;
        }
    }

}
