public class HelloWorldParametros {
    public static void main(String[] args) {
        if (args.length > 0) {
            String nome = args[0];
            System.out.println("Hello, " + nome + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}