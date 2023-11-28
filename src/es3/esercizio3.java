package es3;

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
            int i = 0;
            while (i < input.length()) {
                System.out.println(input.charAt(i));
                i++;
            }
//            String[] lettere = input.split("");
//            String risultato = String.join(",", lettere);
//            System.out.println("caratteri separati:" + risultato);
        }
 scanner.close();
    }
}
