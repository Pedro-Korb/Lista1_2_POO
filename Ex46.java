import java.util.Scanner;

public class Ex46 {

	public static void main(String[] args) {
		// Fuel price

		Scanner input = new Scanner(System.in);

		double fuel_price = 0.0;
		int qtd = 0;
		
		System.out.println("Gasolina: R$2,50\nÁlcool: R$1,90");
		System.out.println("");

		System.out.println("Qual combustível deseja utilizar\n[G] Gasolina\n[A] Álcool");
		char choose1 = input.nextLine().charAt(0);

		if (choose1 == 'A' || choose1 == 'a' || choose1 == 'G' || choose1 == 'g')
		{
			System.out.println("Quantos litros deseja colocar? ");
			qtd = input.nextInt();
		}


		if (choose1 == 'A' || choose1 == 'a')
		{

			System.out.println("Valor antes do desconto: R$" + (qtd * 1.9));
			if (qtd < 20)
			{
				fuel_price = (qtd * 1.9) - (qtd * 1.9 * 0.03); 
			}
			else
			{
				fuel_price = (qtd * 1.9) - (qtd * 1.9 * 0.05);
			}
		}
		else if (choose1 == 'G' || choose1 == 'g')
		{
			System.out.println("Valor antes do desconto: R$" + (qtd * 2.5));
			if (qtd < 20)
			{
				fuel_price = (qtd * 2.5) - (qtd * 2.5 * 0.04); 
			}
			else
			{
				fuel_price = (qtd * 2.5) - (qtd * 2.5 * 0.06);
			}
		}
		else
		{
			System.out.println("Combustível não encontrado! Tente outra resposta!");
		}

		System.out.println("Valor após o desconto: R$" + fuel_price);

		input.close();
	}
}