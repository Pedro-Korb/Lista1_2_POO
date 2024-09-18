import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		// Grade average v3.0
		
		Scanner input = new Scanner(System.in);
		
		float media = 0;
		
		System.out.println("1° nota: ");
		float nota1 = input.nextFloat();
		
		System.out.println("2° nota: ");
		float nota2 = input.nextFloat();
		
		System.out.println("3° nota: ");
		float nota3 = input.nextFloat();
		
		System.out.println("4° nota: ");
		float nota4 = input.nextFloat();
		
		media = ((nota1 + nota2 + nota3 + nota4) / 4);
		
		System.out.println("");
		System.out.println("Média: " + media);
		if (media >= 0 && media < 3)
		{
			System.out.println("Situação: Reprovado");
		}
		else if (media >= 3 && media < 7)
		{
			System.out.println("Situação: Exame");
		}
		else if (media >= 7 && media <= 10)
		{
			System.out.println("Situação: Aprovado");
		}
		else
		{
			System.out.println("Média inválida!");
		}
		
		input.close();
	}
}