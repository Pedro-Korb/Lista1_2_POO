import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		// Quadratic equation
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Complete os valores de: 'A, B e C', da equação 'Ax² + Bx + C'");
		
		float delta = 0;
		
		System.out.println("Ax²: ");
		float ax = input.nextInt();
		
		if (ax == 0)
		{
			System.out.println("A equação não é de segundo grau.");
		}
		else
		{
			System.out.println("Bx: ");
			float bx = input.nextInt();
			
			System.out.println("C: ");
			float c = input.nextInt();
			
			delta = ((bx * bx) - (4 * ax * c));
			
			if (delta < 0)
			{
				System.out.println("A equação não possui raízes reais.");
			}
			else if (delta == 0)
			{
				System.out.println("A equação possui apenas uma raíz real.");
			}
			else
			{
				System.out.println("A equação possui duas raízes reais.");
			}
		}
		
		input.close();
	}
}