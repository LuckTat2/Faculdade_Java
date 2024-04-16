import java.util.Scanner;

public class JavaTeste {

	public static void main(String[] args) {
		System.out.println("Olá, mundo!");
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um valor inteiro");
		int valor;
		valor = teclado.nextInt();
		System.out.println("Valor digitado: "+valor);
	}
}
