import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		// Concept and situation in the subject
		
		Scanner input = new Scanner(System.in);
		
		float media = 0;
		char concept = ' ';
		String situation = " ";
		
		System.out.println("1° nota: ");
		float nota1 = input.nextFloat();
		
		System.out.println("2° nota: ");
		float nota2 = input.nextFloat();
		
		media = ((nota1 + nota2) / 2);
		if (media > 9 && media <= 10)
		{
			concept = 'A';
			situation = "Aprovado";
		}
		else if (media > 7.5 && media <= 9)
		{
			concept = 'B';
			situation = "Aprovado";
		}
		else if (media > 6 && media <= 7.5)
		{
			concept = 'C';
			situation = "Aprovado";
		}
		else if (media > 4 && media <= 6)
		{
			concept = 'D';
			situation = "Reprovado";
		}
		else if (media > 0 && media <= 4)
		{
			concept = 'E';
			situation = "Reprovado";
		}
		else
		{
			situation = "Inválida";
		}
		
		System.out.println("Média: " + media);
		System.out.println("Conceito: " + concept);
		System.out.println("Situação: " + situation);
		input.close();
	}
}