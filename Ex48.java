import java.util.Scanner;

public class Ex48 {

	public static void main(String[] args) {
		// Supermarket

		Scanner input = new Scanner(System.in);

		String nomeCarne = "";
		double precoKg = 0.0;
		double desconto = 0.0;


		System.out.println("Escolha o tipo de carne:");
		System.out.println("1 - Filé Duplo");
		System.out.println("2 - Alcatra");
		System.out.println("3 - Picanha");
		int tipoCarne = input.nextInt();

		System.out.print("Digite a quantidade (Kg) de carne: ");
		double quantidade = input.nextDouble();

		System.out.print("A compra será feita com cartão Tabajara? (S/N): ");
		char cartaoTabajara = input.next().charAt(0);

		if (tipoCarne == 1) 
		{
			nomeCarne = "Filé Duplo";
			if (quantidade <= 5) 
			{
				precoKg = 4.90;
			} else 
			{
				precoKg = 5.80;
			}
		} 
		else if (tipoCarne == 2) 
		{ 
			nomeCarne = "Alcatra";
			if (quantidade <= 5) 
			{
				precoKg = 5.90;
			} else 
			{
				precoKg = 6.80;
			}
		} 
		else if (tipoCarne == 3) 
		{
			nomeCarne = "Picanha";
			if (quantidade <= 5) 
			{
				precoKg = 6.90;
			} else 
			{
				precoKg = 7.80;
			}
		} 
		else 
		{
			System.out.println("Opção inválida de carne.");
		}

		double precoTotal = quantidade * precoKg;

		if (cartaoTabajara == 'S' || cartaoTabajara == 's') 
		{
			desconto = precoTotal * 0.05;
		}

		double valorFinal = precoTotal - desconto;

		System.out.println("");
		System.out.printf("Tipo de carne: " + nomeCarne + "\n");
		System.out.printf("Quantidade: " + quantidade + "Kg\n");
		System.out.printf("Preço total: R$" + precoTotal + "\n");
		if (desconto > 0) 
		{
			System.out.println("Pagamento: Cartão Tabajara\n");
			System.out.printf("Desconto: R$" + desconto + "\n");
		} else 
		{
			System.out.println("Pagamento: Outros\n");
		}
		System.out.printf("Valor a pagar: R$" + valorFinal + "\n");

		input.close();
	}
}