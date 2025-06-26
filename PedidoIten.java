import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PedidoIten {
    static class Item {
        String descricao;
        int quantidade;
        String categoria;

        Item(String descricao, int quantidade, String categoria) {
            this.descricao = descricao;
            this.quantidade = quantidade;
            this.categoria = categoria;
        }

        @Override
        public String toString() {
            return descricao + " — " + quantidade + " un. — " + categoria;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Item> itens = new ArrayList<>();

        while (true) {
            System.out.print("Descrição do item (vazio encerra): ");
            String desc = scanner.nextLine().trim();
            if (desc.isEmpty()) break;

            System.out.print("Quantidade: ");
            int qtd = Integer.parseInt(scanner.nextLine());

            System.out.print("Categoria: ");
            String cat = scanner.nextLine().trim();

            itens.add(new Item(desc, qtd, cat));
        }

        System.out.println("\n--- Pedido Registrado ---");
        if (itens.isEmpty()) {
            System.out.println("Nenhum item cadastrado.");
        } else {
            itens.forEach(item -> System.out.println(item));
            System.out.println("Total de itens: " + itens.size());
        }

        scanner.close();
    }
}