import java.util.Scanner;

public class Ex025 {

	public static void main(String[] args) {
		// Ideal weight v2.0
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Altura: ");
		float height = input.nextFloat();
		
		
		System.out.println("Peso: ");
		float weight = input.nextFloat();
		
		input.nextLine();
		
		System .out.println("Sexo [M] [F]: ");
		char gender = input.nextLine().charAt(0);
		
		
		if (gender == 'M' || gender == 'm')
		{
			double ideal_weight = ((72.7*height) - 58);
			
			System.out.println("Altura: " + height + "m");
			System.out.println("Sexo: Masculino");	
		
			if (weight > ideal_weight)
			{
				System.out.println("Peso ideal: " + ideal_weight + "Kg");
				System.out.println("Você está acima do peso ideal.");
			}
			else if (weight < ideal_weight)
			{
				System.out.println("Peso ideal: " + ideal_weight + "Kg");
				System.out.println("Você está abaixo do peso ideal.");
			}
			else
			{
				System.out.println("Peso ideal: " + ideal_weight + "Kg");
				System.out.println("Você está no peso ideal. Parabéns!");
			}
		}
		
		else if (gender == 'F' || gender == 'f')
		{
			double ideal_weight = ((62.1*height) - 44.7);
			
			System.out.println("Altura: " + height + "m");
			System.out.println("Sexo: Feminino");
	
			
			if (weight > ideal_weight)
			{
				System.out.println("Peso ideal: " + ideal_weight + "Kg");
				System.out.println("Você está acima do peso ideal.");
			}
			else if (weight < ideal_weight)
			{
				System.out.println("Peso ideal: " + ideal_weight + "Kg");
				System.out.println("Você está abaixo do peso ideal.");
			}
			else
			{
				System.out.println("Peso ideal: " + ideal_weight + "Kg");
				System.out.println("Você está no peso ideal. Parabéns!");
			}
		}
		input.close();
	}

}
