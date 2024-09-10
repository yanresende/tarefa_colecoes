import java.util.Arrays;
import java.util.Scanner;

public class OrdenaNomes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite nomes separados por vírgulas:");

        String input = scanner.nextLine();

        String[] nomes = input.split(",");

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = nomes[i].trim();
        }

        Arrays.sort(nomes);

        System.out.println("Nomes ordenados em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

            scanner.close();
    }
}
