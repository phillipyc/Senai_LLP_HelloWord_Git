import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MediaLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numeros = new ArrayList<>();

        System.out.println("Digite números (negative para parar):");
        while (true) {
            System.out.print("> ");
            double valor = scanner.nextDouble();
            if (valor < 0) break;  // sentinela para encerrar
            numeros.add(valor);
        }
        scanner.close();

        if (numeros.isEmpty()) {
            System.out.println("Nenhum número válido foi informado.");
        } else {
            double soma = 0;
            for (double v : numeros) soma += v;
            double media = soma / numeros.size();
            System.out.printf("Média: %.2f%n", media);
        }
    }
}