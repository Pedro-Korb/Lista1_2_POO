import java.util.Scanner;

public class Ex013 {

	public static void main(String[] args) {
		
		// Fine on fish
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Peso dos peixes: ");
		float peso_peixes = entrada.nextFloat();
		
		if (peso_peixes > 50)
		{
			float multa = ((peso_peixes - 50) * 4);
			System.out.println(peso_peixes - 50 + "Kg excederam o limite. Valor da multa: R$" + multa);
		}
		else
		{
			System.out.println("Peso abaixo do limite. Sem multa a pagar!");
		}
		entrada.close();
	}
}
