import java.util.Scanner;

public class Ex011 {

	public static void main(String[] args) {
		
		// Ideal weight
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua altura (em metros): ");
		double altura = entrada.nextDouble();
		
		double peso_ideal = ((72.7 * altura) - 58);
		System.out.println("Seu peso ideal é: " + peso_ideal + "Kg");
		
		entrada.close();
	}

}
