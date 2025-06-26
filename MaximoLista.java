import java.util.*;

public class MaximoLista {
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
        
        // Encontrando o valor máximo
        double maximo = Collections.max(lista);
        
        // Exibindo o resultado
        System.out.printf("O maior valor informado é: %.3f%n", maximo);
    }
}
