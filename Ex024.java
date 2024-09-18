import java.util.Scanner;

public class Ex024 {

	public static void main(String[] args) {
		// Approval or disapproval
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Primeira nota: ");
		float nota1 = ent.nextFloat();
		
		System.out.println("Segunda nota: ");
		float nota2 = ent.nextFloat();
		
		
		float media = ((nota1 + nota2) / 2);
		
		if (media >= 7)
		{
			System.out.println("Média = " + media + " --> Aprovado!");
		}
		else
		{
			System.out.println("Média = " + media + " --> Reprovado!");
		}
		ent.close();
		
	}

}
