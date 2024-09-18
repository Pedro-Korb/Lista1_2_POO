import java.util.Scanner;

public class Ex43 {

	public static void main(String[] args) {
		// Decimal or integer

		Scanner input = new Scanner(System.in);

		System.out.print("Digite um número: ");
		double number = input.nextDouble();

		if (number == Math.floor(number))
		{
			System.out.println("O número é inteiro");
		} 
		else 
		{
			System.out.println("O número é decimal");
		}
		
		input.close();
	}
}