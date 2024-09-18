import java.util.Scanner;

public class Ex39 {

	public static void main(String[] args) {
		// Average age
		
		Scanner input = new Scanner(System.in);
		
		float media = 0;
		
		System.out.println("Idade da 1° pessoa: ");
		int age1 = input.nextInt();
		
		System.out.println("Idade da 2° pessoa: ");
		int age2 = input.nextInt();
		
		System.out.println("Idade da 3° pessoa: ");
		int age3 = input.nextInt();
		
		media = (age1 + age2 + age3) / 3;
		
		
		System.out.println("");
		
		if (media > 0 && media <= 25)
		{
			System.out.println("Turma jovem");
		}
		else if (media > 25 && media <= 45)
		{
			System.out.println("Turma adulta");
		}
		else if (media > 45 && media < 120)
		{
			System.out.println("Turma idosa");
		}
		else
		{
			System.out.println("Média de idades inválida!");
		}
		
		input.close();
	}
}