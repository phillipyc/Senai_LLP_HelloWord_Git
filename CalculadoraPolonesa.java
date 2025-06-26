import java.util.Stack;

public class CalculadoraPolonesa {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println("Uso: java CalculadoraPolonesa <num1> <num2> <operador>");
            System.exit(1);
        }
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        String op = args[2];

        double resultado;
        switch (op) {
            case "+":
                resultado = a + b;
                break;
            case "-":
                resultado = a - b;
                break;
            case "*":
                resultado = a * b;
                break;
            case "/":
                resultado = a / b;
                break;
            default:
                System.err.println("Operador inválido: " + op);
                return;
        }
        System.out.printf("%.0f %s %.0f = %.0f%n", a, op, b, resultado);
    }
}