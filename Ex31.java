import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		// Package origin 
		
		Scanner input = new Scanner(System.in);
		
		String local = "";
		
		System.out.println("Preço da encomenda: R$");
		double price = input.nextDouble();
		
		System.out.println("Código origem: ");
		int origin = input.nextInt();
		
		System.out.println("");
		System.out.println("Preço do produto: R$" + price); 
		
		if(origin == 1)
		{
			local = "Sul";
		}
		else if (origin == 2)
		{
			local = "Norte";
		}
		else if (origin == 3)
		{
			local = "Nordeste";
		}
		else if (origin == 4)
		{
			local = "Centro-Oeste";
		}
		else if (origin == 5)
		{
			local = "Sudeste";
		}
		else
		{
			local = "Importado";
		}
		
		System.out.println("Origem do produto: " + local);
		
		
		input.close();
	}
}