import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		// Hundreds, tens and units

		Scanner input = new Scanner(System.in);

		int hundreds = 0;
		int tens = 0;
		int units = 0;

		System.out.println("Digite um valor menor que 1000: ");
		int value = input.nextInt();

		if (value < 0 || value > 1000)
		{
			System.out.println("Valor inválido!");
		}
		else
		{
			hundreds = value / 100;
			tens = (value - (hundreds * 100)) / 10;
			units = value - (hundreds * 100) - (tens * 10);

			System.out.println("Centenas: " + hundreds);
			System.out.println("Dezenas: " + tens);
			System.out.println("Unidades: " + units);
		}

		input.close();
	}
}