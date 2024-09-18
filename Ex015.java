import java.util.Scanner;

public class Ex015 {

	public static void main(String[] args) {
		// Calculation for paints 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos m² deseja pintar: ");
		float metros_quad = entrada.nextFloat();
		
		float litros_tinta = (metros_quad / 6);
		float baldes_tinta = (litros_tinta / 18);
		float valor_tinta = (baldes_tinta * 80);
		
		System.out.println("Será utilizado " + litros_tinta + "l de tinta, " + baldes_tinta + " baldes de tinta, com valor total de R$" + valor_tinta);
		
		entrada.close();
	}

}
