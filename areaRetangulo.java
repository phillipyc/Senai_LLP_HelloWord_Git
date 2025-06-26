import java.util.Scanner;

public class areaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a base e a altura do triângulo
        System.out.print("Digite o valor da base do triângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite o valor da altura do triângulo: ");
        double altura = scanner.nextDouble();

        // Calcula a área
        double area = (base * altura) / 2;

        // Exibe o resultado
        System.out.printf("A área do triângulo é: %.2f unidades quadradas%n", area);

        scanner.close();
    }
}