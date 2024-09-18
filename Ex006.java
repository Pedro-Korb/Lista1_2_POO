import java.util.Scanner;
public class Ex006 {

	public static void main(String[] args) {
		
		// Circle area
		
		double pi = 3.141592;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Raio do círculo: (em metros)");
		double raio = entrada.nextDouble();
		
		double area = (pi * (raio * raio));
		
		System.out.println("Área do círculo é igual a " + area + "m²");
		entrada.close();
	}

}
