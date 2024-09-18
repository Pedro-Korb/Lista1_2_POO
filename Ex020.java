import java.util.Scanner;

public class Ex020 {

	public static void main(String[] args) {
		// Leap year
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um ano: ");
		int ano = entrada.nextInt();
		
		if (ano % 4 == 0)
		{
			System.out.println("O ano " + ano + " é bissesto.");
		}
		else
		{
			System.out.println("O ano " + ano + " não é bissesto.");
		}
		
		entrada.close();

	}

}
