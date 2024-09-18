import java.util.Scanner;

public class Ex009 {

	public static void main(String[] args) {
		
		// Temperature transformation
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Temperatura em graus Fahrenheit: ");
		float fahr = entrada.nextFloat();
		
		float transform = ((fahr - 32)/9) * 5;
		
		System.out.println(fahr + "°F em graus Celsiu = " + transform + "°C");
		entrada.close();
	}

}
