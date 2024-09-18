import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		// Valid or invalid date
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite uma data");
		System.out.println("Dia: ");
		int day = input.nextInt();
		
		System.out.println("Mês: ");
		int month = input.nextInt();
		
		System.out.println("Ano (sem abreviações): ");
		int year = input.nextInt();
		
		System.out.println("");
		
		if (day >= 1 && day <= 31)
		{
			if (month >= 1 && month <= 12)
			{
				if (year >= 1 && year <= 5000)
				{
					System.out.println(day + "/" + month + "/" + year);
					System.out.println("A data informada é VÁLIDA!");
					
				}
				else
				{
					System.out.println(day + "/" + month + "/" + year);
					System.out.println("A data informada é INVÁLIDA!");
				}
			}
			else
			{
				System.out.println(day + "/" + month + "/" + year);
				System.out.println("A data informada é INVÁLIDA!");
			}
		}
		else
		{
			System.out.println(day + "/" + month + "/" + year);
			System.out.println("A data informada é INVÁLIDA!");
		}
		input.close();
	}
}