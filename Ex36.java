import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		// Leap year v2.0

		Scanner input = new Scanner(System.in);

		System.out.println("Digite um ano: ");
		int ano = input.nextInt();

		if (ano % 4 == 0)
		{
			System.out.println("O ano " + ano + " é bissesto. ");
		}
		else
		{
			System.out.println("O ano " + ano + " não é bissesto. ");
		}

		input.close();
	}
}