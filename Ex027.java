import java.util.Scanner;

public class Ex027 {

	public static void main(String[] args) {
		// Good morning, afternoon or evening
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual turno você estuda: \n[M] Matutino\n[V] Vespertino\n[N]Noturno");
		char choose = input.nextLine().charAt(0);
		
		if(choose == 'M' | choose == 'm')
		{
			System.out.println("Bom dia!");
		}
		
		else if (choose == 'V' || choose == 'v')
		{
			System.out.println("Boa tarde!");
		}
		
		else if (choose == 'N'| choose == 'n')
		{
			System.out.println("Boa noite!");
		}
		
		else
		{
			System.out.println("Turno não existente!");
		}
		
		input.close();
	}
}