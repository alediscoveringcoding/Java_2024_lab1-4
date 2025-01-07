package Lab_4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void meniu() {
        System.out.println("alege optiunea ");
        System.out.println("1 afisarea tuturor echipamentelor");
        System.out.println("2 afisarea imprimantelor ");
        System.out.println("3 afisarea copiatoarelor ");
        System.out.println("4 afisarea sistemelor de calcul ");
        System.out.println("5 modificarea starii ");
        System.out.println("6 Setarea unui anumit mod de scriere pentru imprimanta ");
        System.out.println("7 Setarea unui format de copiere pentru copiatoare ");
        System.out.println("8 Instalarea unui anumit sistem de operare ");
        System.out.println("9 afisarea echipamentelor vandute ");
        System.out.println("0 Exit");
        System.out.println("\n");
    }

    public static void citiredinfisier(List<Echipament> echipamente) {
        try {
            File file = new File("src/Lab_4/echipamente.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                String[] split = line.split(";");

                String denumire = split[0].trim();
                int nr_inv = Integer.parseInt(split[1].trim());
                int pret = Integer.parseInt(split[2].trim());
                Echipament.Zona_mag zona = Echipament.Zona_mag.valueOf(split[3].trim().toUpperCase());

                Echipament.Situatie situatie = null;
                try {
                    situatie = Echipament.Situatie.valueOf(split[4].trim().toUpperCase());
                } catch (IllegalArgumentException e) {
                    System.out.println("Situatie invalida: " + split[4].trim() + " pentru echipamentul " + denumire);
                }

                String tip = split[5].trim().toLowerCase();
                if (situatie != null) {
                    echipamente.add(new Echipament(denumire, nr_inv, pret, zona, situatie));
                }
                switch (tip) {
                    case "copiator":
                        try {
                            int nrpag = Integer.parseInt(split[6].trim());
                            String p_ton = split[7].trim();
                            Copiatoare.Format format = Copiatoare.Format.valueOf(split[8].trim().toUpperCase());
                            echipamente.add(new Copiatoare(denumire, nr_inv, pret, zona, situatie, nrpag, p_ton, format));
                        } catch (Exception e) {
                            System.out.println("Eroare la citirea copiatorului: " + e.getMessage());
                        }
                        break;

                    case "imprimanta":
                        try {
                            int ppm = Integer.parseInt(split[6].trim());
                            int rezolutie = Integer.parseInt(split[7].trim());
                            Imprimante.Mod mod = Imprimante.Mod.valueOf(split[8].trim().toUpperCase());
                            echipamente.add(new Imprimante(denumire, nr_inv, pret, zona, situatie, ppm, rezolutie, mod));
                        } catch (Exception e) {
                            System.out.println("Eroare la citirea imprimantei: " + e.getMessage());
                        }
                        break;


                    case "sistem de calcul":
                        try {
                            String tip_m = split[6].trim();
                            double viteza = Double.parseDouble(split[7].trim());
                            int capacitate = Integer.parseInt(split[8].trim());
                            Sisteme.SO operare = Sisteme.SO.valueOf(split[9].trim().toUpperCase());
                            echipamente.add(new Sisteme(denumire, nr_inv, pret, zona, situatie, tip_m, viteza, capacitate, operare));
                        } catch (Exception e) {
                            System.out.println("Eroare la citirea sistemului de calcul: " + e.getMessage());
                        }
                        break;

                    default:
                        System.out.println("Tip necunoscut: " + tip + " în linia: " + line);
                        break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Afisare echipamente
    public static void afisare_echipamente(List<Echipament> echi) {
        System.out.println("Toate echipamentele:");
        for (Echipament e : echi) {
            System.out.println(e);
        }
        System.out.println("\n");
    }

    // Afisare imprimante
    public static void afisare_imprimante(List<Echipament> echipamente) {
        for (Echipament e : echipamente) {
            if (e instanceof Imprimante) {
                System.out.println(e.toString());
            }
        }
        System.out.println();
    }

    // Afisare copiatoare
    public static void afisare_copiatoare(List<Echipament> echi) {
        System.out.println("Copiatoare:");
        echi.stream()
                .filter(e -> e instanceof Copiatoare)
                .forEach(System.out::println);
    }

    // Afisare sisteme de calcul
    public static void afisare_sistem(List<Echipament> echi) {
        System.out.println("Sisteme de calcul:");
        echi.stream()
                .filter(e -> e instanceof Sisteme)
                .forEach(System.out::println);
    }

    public static void main(String[] args) throws IOException {
        List<Echipament> echi = new ArrayList<>();
        meniu();
        citiredinfisier(echi);
        Scanner scan = new Scanner(System.in);
        int opt;

        do {
            opt = scan.nextInt();

            switch (opt) {
                case 0:
                    System.out.println("Exit");
                    break;

                case 1:
                    afisare_echipamente(echi);
                    break;

                case 2:
                    afisare_imprimante(echi);
                    break;

                case 3:
                    afisare_copiatoare(echi);
                    break;

                case 4:
                    afisare_sistem(echi);
                    break;

                default:
                    System.out.println("Optiune invalida");
            }
        } while (opt != 0);

        scan.close();
    }
}
