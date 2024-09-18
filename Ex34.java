import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		// Types of triangle
		
		Scanner input = new Scanner(System.in);
		
		String triangle = " ";
		
		System.out.println("Escreva a medida dos lados dos triângulos");
		
		System.out.println("Lado A: ");
		float sideA = input.nextFloat();
		
		System.out.println("Lado B: ");
		float sideB = input.nextFloat();
		
		System.out.println("Lado C: ");
		float sideC = input.nextFloat();
		
		if (sideA == sideB && sideB == sideC)
		{
			triangle = "Equilátero (3 lados iguais)";
		}
		else if (sideA == sideB || sideB == sideC || sideC == sideA)
		{
			triangle = "Isósceles (2 lados iguais)";
		}
		else
		{
			triangle= "Escaleno (todos lados diferentes)";
		}
		
		System.out.println("Tipo de triângulo: " + triangle);
		
		input.close();
	}
}