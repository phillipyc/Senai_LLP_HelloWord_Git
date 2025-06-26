import java.util.Scanner;
public class HelloWorldInterativo

{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Escreva seu nome: ");
		String nome = scanner.nextLine();
		System.out.println("HelloWorld "+ nome);
		
	}
}