import java.util.Scanner;

public class Ex019 {
	public static void main(String[] args) {
		// Gender
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite M ou F: ");
		String sexo = entrada.nextLine().toUpperCase();
		
		
		if (sexo.equals("F"))
		{
			System.out.println("Sexo: Feminino");
		}
		else if (sexo.equals("M"))
		{
			System.out.println("Sexo: Masculino");
		}
		else
		{
			System.out.println("Sexo não identificado.");
		}
		entrada.close();
	}

}
