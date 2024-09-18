import java.util.Scanner;

public class Ex019 {
	public static void main(String[] args) {
		// Gender
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite M ou F: ");
		char sexo = entrada.nextLine().charAt(0);
		
		if (sexo == 'F' || sexo == 'f')
		{
			System.out.println("Sexo: Feminino");
		}
		else if (sexo == 'M' || sexo == 'm')
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
