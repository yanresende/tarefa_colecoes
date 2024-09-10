import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OrdenaNomesPorGenero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out
                .println("Digite nomes e gêneros no formato nome-gênero separados por vírgula (ex: Yan-m, Sabrina-f):");

        String input = scanner.nextLine();

        String[] pares = input.split(",");

        List<String> nomesMasculinos = new ArrayList<>();
        List<String> nomesFemininos = new ArrayList<>();

        for (String par : pares) {

            String[] nomeEGenero = par.trim().split("-");

            if (nomeEGenero.length == 2) {
                String nome = nomeEGenero[0].trim();
                String genero = nomeEGenero[1].trim().toLowerCase();

                if (genero.equals("m")) {
                    nomesMasculinos.add(nome);
                } else if (genero.equals("f")) {
                    nomesFemininos.add(nome);
                }
            }
        }

        String[] arrayMasculinos = nomesMasculinos.toArray(new String[0]);
        String[] arrayFemininos = nomesFemininos.toArray(new String[0]);

        Arrays.sort(arrayMasculinos);
        Arrays.sort(arrayFemininos);

        System.out.println("Nomes masculinos em ordem alfabética:");
        for (String nome : arrayMasculinos) {
            System.out.println(nome);
        }

        System.out.println("\nNomes femininos em ordem alfabética:");
        for (String nome : arrayFemininos) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
