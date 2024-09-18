import java.util.Scanner;

public class Ex40 {

	public static void main(String[] args) {
		// Average grade
		
		Scanner input = new Scanner(System.in);
		
		float average = 0;
		
		System.out.println("1° Nota: ");
		float grade1 = input.nextInt();
		
		System.out.println("2° Nota: ");
		float grade2 = input.nextInt();
		
		System.out.println("3° Nota: ");
		float grade3 = input.nextInt();
		
		average = ((grade1 + grade2 + grade3) / 3);
		
		System.out.println("");
		
		System.out.println("Média: " + average);
		if (average >= 7 && average < 10)
		{
			System.out.println("Aprovado!");
		}
		else if (average >= 0 && average < 7)
		{
			System.out.println("Reprovado!");
		}
		else if (average == 10)
		{
			System.out.println("Aprovado por distinção!");
		}
		else
		{
			System.out.println("Média inválida!");
		}
		
		input.close();
	}
}