import java.util.Scanner;

public class Ex45 {

	public static void main(String[] args) {
		// Killer test

		Scanner input = new Scanner(System.in);


		int cont = 0;

		System.out.println("Telefonou para a vítima?\n[1] Sim\n[0] Não");
		cont += input.nextInt();

		System.out.println("Esteve no local do crime?\n[1] Sim\n[0] Não");
		cont += input.nextInt(); 

		System.out.println("Mora perto da vítima?\n[1] Sim\n[0] Não");
		cont += input.nextInt(); 

		System.out.println("Devia para a vítima?\n[1] Sim\n[0] Não");
		cont += input.nextInt(); 

		System.out.println("Já trabalhou com a vítima?\n[1] Sim\n[0] Não");
		cont += input.nextInt(); 

		if (cont == 2)
		{
			System.out.println("Classificação: SUSPEITO");
		}
		else if (cont == 3 || cont == 4)
		{
			System.out.println("Classificação: CÚMPLICE");
		}
		else if (cont == 5)
		{
			System.out.println("Classificação: ASSASSINO");
		}
		else if (cont == 1 || cont == 0)
		{
			System.out.println("Classificação: INOCENTE");
		}
		else
		{
			System.out.println("Classificação: INVÁLIDA");
		}

		input.close();
	}
}