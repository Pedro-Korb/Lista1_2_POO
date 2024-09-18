import java.util.Scanner;

public class Ex016 {

	public static void main(String[] args) {
		// Calculation for paints v2.0
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos m² deseja pintar: ");
		float metros_quad = entrada.nextFloat();
		
		float litros_tinta = (metros_quad / 6);
		float baldes_tinta = (litros_tinta / 18);
		float valor_tinta = (baldes_tinta * 80);
		
		double baldes_tinta_menor = (litros_tinta / 3.6);
		double valor_tinta_menor = (baldes_tinta_menor * 25);
		
		System.out.println("Será utilizado " + litros_tinta + "l de tinta, ");
		System.out.println("Baldes de tinta de 18l: " + baldes_tinta + " unidades, com valor total de R$" + valor_tinta);
		System.out.println("Baldes de tinta de 3,6l: " + baldes_tinta_menor + " unidades, com valor total de R$" + valor_tinta_menor);
		
		entrada.close();
	}

}
