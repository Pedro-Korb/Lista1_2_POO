import java.util.Scanner;

public class Ex010 {

	public static void main(String[] args) {
		
		// Math operations
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Primeiro valor (inteiro): ");
		float num1 = entrada.nextFloat();
		
		System.out.println("Segundo valor (inteiro): ");
		float num2 = entrada.nextFloat();
		
		System.out.println("Terceiro valor (real): ");
		float num3 = entrada.nextFloat();
		
		float primeira_operacao = ((2 * num1) * (num2 / 2));
		float segunda_operacao = ((3 * num1) + num3);
		float terceira_operacao = (num3 * num3 * num3);
		
		System.out.println("Primeira operação: " + primeira_operacao);
		System.out.println("Segunda operação " + segunda_operacao);
		System.out.println("Terceira operação " + terceira_operacao);
		entrada.close();
	}
}
