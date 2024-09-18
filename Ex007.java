import java.util.Scanner;
public class Ex007 {

	public static void main(String[] args) {
		
		// Square area
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Lado do quadrado (em metros): ");
		double lado = entrada.nextDouble();
		
		double area = (lado * lado);
		
		System.out.println("Área do quadrado = " + area + "m²");
		entrada.close();
	}

}
