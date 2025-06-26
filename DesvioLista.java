import java.util.*;

public class DesvioLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> lista = new ArrayList<>();
        
        // Leitura dos valores até entrada vazia
        while (true) {
            System.out.print("Digite um número (ou ENTER para finalizar): ");
            String input = sc.nextLine().trim();
            if (input.isEmpty()) break;
            try {
                lista.add(Double.parseDouble(input));
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido, tente novamente.");
            }
        }
        sc.close();
        
        if (lista.isEmpty()) {
            System.out.println("Nenhum valor foi informado.");
            return;
        }
        
        
        double soma = 0;
        for (double v : lista) {
            soma += v;
        }
        double media = soma / lista.size();
        
        // Cálculo da soma dos quadrados das diferenças em relação à média
        double somaQuadrados = 0;
        for (double v : lista) {
            somaQuadrados += Math.pow(v - media, 2);
        }
        
        // Cálculo do desvio padrão amostral
        double desvioPadrao = Math.sqrt(somaQuadrados / (lista.size() - 1));
        
        // Exibição do resultado
        System.out.printf("Desvio padrão amostral = %.3f%n", desvioPadrao);
    }
}
