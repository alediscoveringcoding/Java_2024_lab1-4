package Lab_2.ex1;

import java.io.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] judete = citesteJudete("src/Lab_2/ex1/judete_in.txt");

        if (judete != null) {
            Arrays.sort(judete); // Sortăm județele în ordine alfabetică

            // Afișăm județele ordonate
            System.out.println("Județele ordonate alfabetic:");
            for (String judet : judete) {
                System.out.println(judet);
            }

            // Căutăm județul introdus de la tastatură
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nIntroduceți județul căutat: ");
            String judetCautat = scanner.nextLine();

            int pozitie = Arrays.binarySearch(judete, judetCautat);
            if (pozitie >= 0) {
                System.out.println("Județul '" + judetCautat + "' se află pe poziția " + (pozitie + 1) + " în lista ordonată.");
            } else {
                System.out.println("Județul '" + judetCautat + "' nu a fost găsit în lista ordonată.");
            }
        }

    }

    public static String[] citesteJudete(String numeFisier) {
        try (BufferedReader reader = new BufferedReader(new FileReader(numeFisier))) {
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            return content.toString().split("\n");
        } catch (IOException e) {
            System.err.println("Eroare la citirea din fișier: " + e.getMessage());
            return null;
        }
    }
}

