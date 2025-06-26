import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Informe sua altura (m): ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);

        System.out.printf("IMC: %.2f — %s%n",
                          imc,
                          interpretarIMC(imc));

        scanner.close();
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String interpretarIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25.0) {
            return "Peso normal";
        } else if (imc < 30.0) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}