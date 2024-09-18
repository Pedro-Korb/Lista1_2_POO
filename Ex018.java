import java.util.Scanner;

public class Ex018 {

	public static void main(String[] args) {
		// Positive, neutral or negative
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite qualquer valor inteiro: ");
		int valor = entrada.nextInt();
		
		if (valor > 0) 
		{
			System.out.println("O valor é positivo.");
		}
		else if (valor < 0)
		{
			System.out.println("O valor é negativo.");
		}
		else
		{
			System.out.println("Valor é neutro.");
		}
		
		entrada.close();
	}

}
