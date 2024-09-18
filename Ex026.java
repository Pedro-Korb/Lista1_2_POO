import java.util.Scanner;

public class Ex026 {

	public static void main(String[] args) {
		// Highest and lowest value
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Primeiro valor: ");
		int num1 = input.nextInt();
		
		int greater_value = num1;
		int lowest_value = num1;
		
		System.out.println("Segundo valor: ");
		int num2 = input.nextInt();
		
		
		if (num2 > greater_value)
		{
			greater_value = num2;
		}
		
		if (num2 < lowest_value)
		{
			lowest_value = num2;
		}
		
		System.out.println("Terceiro valor: ");
		int num3 = input.nextInt();
		
		
		if (num3 > greater_value)
		{
			greater_value = num3;
		}
		
		if (num3 < lowest_value)
		{
			lowest_value = num3;
		}
		
		
		System.out.println("valores digitados: " + num1 + ", " + num2 + ", " + num3);
		System.out.println("Maior valor: " + greater_value);
		System.out.println("Menor valor: " + lowest_value);
		
		input.close();
	}
}
