import java.util.Scanner;
public class Ex005 {

	public static void main(String[] args) {
		
		// meter to centimeters
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Medida em metros: ");
		float meter = entrada.nextFloat();
		
		float medida = meter * 100;
		
		System.out.println(meter + "m em centímetros = " + medida + "cm");
		
		entrada.close();
	}
}
