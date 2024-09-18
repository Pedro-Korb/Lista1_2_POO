import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		// Days of the week
		
		Scanner input = new Scanner(System.in);
		
		String day = "";
		
		System.out.println("Qua dia é hoje? \n[1] Domingo\n[2] Segunda-Feira\n[3] Terça-Feira\n[4] Quarta-Feira\n[5] Quinta-Feira\n[6] Sexta-Feira\n[7] Sábado");
		int choose = input.nextInt(); 
		
		if (choose == 1)
		{
			day = "Domingo";
		}
		else if (choose == 2)
		{
			day = "Segunda-Feira";
		}
		else if (choose == 3)
		{
			day = "Terça-Feira";
		}
		else if (choose == 4)
		{
			day = "Quarta-Feira";
		}
		else if (choose == 5)
		{
			day = "Quinta-Feira";
		}
		else if (choose == 6)
		{
			day = "Sexta-Feira";
		}
		else if (choose == 7)
		{
			day = "Sábado";
		}
		else
		{
			System.out.println("Resposta inválida!");
		}
		
		if (choose >= 1 && choose <= 7)
		{
			System.out.println("");
			System.out.println("Bom dia! Hoje é " + day + ".");
		}
		
		input.close();
	}
}