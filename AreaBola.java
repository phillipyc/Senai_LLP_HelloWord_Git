import java.util.Scanner;

public class AreaBola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio da bola: ");
        double raio = sc.nextDouble();

        double area = 4 * Math.PI * Math.pow(raio, 2);

        System.out.printf("A área da superfície da bola é: %.2f unidades quadradas%n", area);

        sc.close();
    }
}