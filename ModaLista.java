import java.util.*;

public class ModaLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> lista = new ArrayList<>();
        
        // Leitura dos valores até entrada vazia
        while (true) {
            System.out.print("Digite um valor (ou ENTER para finalizar): ");
            String line = sc.nextLine().trim();
            if (line.isEmpty()) break;
            try {
                lista.add(Double.parseDouble(line));
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido, tente novamente.");
            }
        }
        sc.close();
        
        if (lista.isEmpty()) {
            System.out.println("Nenhum valor foi informado.");
            return;
        }
        
        // Ordenação da lista
        Collections.sort(lista);
        int n = lista.size();
        
        // Cálculo da média
        double soma = 0;
        Map<Double, Integer> frequencias = new HashMap<>();
        for (double v : lista) {
            soma += v;
            frequencias.put(v, frequencias.getOrDefault(v, 0) + 1);
        }
        double media = soma / n;
        
        // Cálculo do mínimo e máximo
        double min = lista.get(0);
        double max = lista.get(n - 1);
        
        // Cálculo da moda
        double moda = lista.get(0);
        int maxFreq = 1;
        for (Map.Entry<Double, Integer> entry : frequencias.entrySet()) {
            if (entry.getValue() > maxFreq) {
                moda = entry.getKey();
                maxFreq = entry.getValue();
            }
        }
        
        // Cálculo do desvio padrão
        double somaQuadrados = 0;
        for (double v : lista) {
            somaQuadrados += Math.pow(v - media, 2);
        }
        double desvioPadrao = Math.sqrt(somaQuadrados / (n - 1));
        
        // Exibição dos resultados
        System.out.printf("Média = %.3f%n", media);
        System.out.printf("Moda = %.3f%n", moda);
        System.out.printf("Mínimo = %.3f%n", min);
        System.out.printf("Máximo = %.3f%n", max);
        System.out.printf("Desvio padrão = %.3f%n", desvioPadrao);
    }
}
