import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestaoEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos alunos deseja cadastrar? ");
        int numAlunos = scanner.nextInt();
        scanner.nextLine(); // consome o \n

        List<String> nomes = new ArrayList<>();
        List<List<Double>> notasPorAluno = new ArrayList<>();

        for (int i = 0; i < numAlunos; i++) {
            System.out.printf("Digite o nome do aluno %d: ", i + 1);
            String nome = scanner.nextLine();
            nomes.add(nome);

            System.out.printf("Quantas notas terá %s? ", nome);
            int qtdNotas = scanner.nextInt();

            List<Double> notas = new ArrayList<>();
            for (int j = 0; j < qtdNotas; j++) {
                System.out.printf("Digite a nota %d para %s: ", j + 1, nome);
                double nota = scanner.nextDouble();
                notas.add(nota);
            }
            scanner.nextLine(); // consome o \n
            notasPorAluno.add(notas);
        }

        System.out.println("\n=== Resultado Final ===");
        for (int i = 0; i < numAlunos; i++) {
            String nome = nomes.get(i);
            List<Double> notas = notasPorAluno.get(i);

            double soma = 0;
            for (double n : notas)
                soma += n;
            double media = soma / notas.size();

            String status = media >= 6.0 ? "APROVADO" : "REPROVADO";
            System.out.printf("%s -> Média: %.2f -> %s%n", nome, media, status);
        }
        scanner.close();
    }
}