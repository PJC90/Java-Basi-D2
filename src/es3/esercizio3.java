package es3;

import java.util.Arrays;
import java.util.Scanner;

public class esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println("Inserisci una stringa");
            input = scanner.nextLine();
            if (input.equals(":q")) {
                System.out.println("fine, hai messo la q");
                break;
            }
            String[] caratteri = input.split(",");
            System.out.println("caratteri separati:");
            int i = 0;
            while (i < caratteri.length) {
                System.out.println(caratteri[i].trim());
                i++;
            }
        }
 scanner.close();
    }
}
