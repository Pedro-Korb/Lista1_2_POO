import java.util.Scanner;

public class Ex012 {

	public static void main(String[] args) {
		
		// Ideal weight v2.0
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Altura (em metros): ");
		double altura = entrada.nextDouble();
		
		double peso_idealHomem = ((72.7 * altura) - 58);
		double peso_idealMulher = ((62.1 * altura) - 44.7);
		
		System.out.println("Peso ideal (Homem): " + peso_idealHomem + "Kg");
		System.out.println("Peso ideal (Mulher): " + peso_idealMulher + "Kg");
		
		entrada.close();

	}

}
