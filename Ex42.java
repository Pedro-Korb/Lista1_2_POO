import java.util.Scanner;

public class Ex42 {

	public static void main(String[] args) {
		// Even or odd
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro: ");
		int even_odd = input.nextInt();
		
		
		System.out.println("");
		
		if (even_odd % 2 == 0)
		{
			System.out.println("O valor " + even_odd + " é PAR");
		}
		else
		{
			System.out.println("O valor " + even_odd + " é ÍMPAR");
		}
		
		input.close();
	}
}