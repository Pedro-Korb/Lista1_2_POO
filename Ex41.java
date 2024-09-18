import java.util.Scanner;

public class Ex41 {

	public static void main(String[] args) {
		// Withdraw from ATM

		Scanner input = new Scanner(System.in);

		int cash100 = 0;
		int cash50 = 0;
		int cash10 = 0;
		int cash5 = 0;
		int cash1 = 0;

		System.out.println("Qual valor deeja sacar?: (mínimo de 10 e máximo de 600 reais: ");
		int atm = input.nextInt();

		cash100 = atm / 100;
		cash50 = (atm - (cash100 * 100)) / 50;
		cash10 = (atm - (cash100 * 100) - (cash50 * 50))/ 10;
		cash5 = (atm - (cash100 * 100) - (cash50 * 50) - (cash10 * 10)) / 5;
		cash1 = (atm - (cash100 * 100) - (cash50 * 50) - (cash10 * 10) - (cash5 * 5));

		if (atm < 0 || atm > 600)
		{
			System.out.println("Quantidade não existente no caixa eletrônico!");
		}

		else
		{
			System.out.println("");

			System.out.println("Para sacar a quantidade de R$" + atm + ", serão fornecidas as seguintes cédulas:");
			System.out.println("Notas de 100       --    " + cash100 + " unidades");
			System.out.println("Notas de 50        --    " + cash50 + " unidades");
			System.out.println("Notas de 10        --    " + cash10 + " unidades");
			System.out.println("Notas de 5         --    " + cash5 + " unidades");
			System.out.println("Moedas de 1 real   --    " + cash1 + " unidades");
		}


		input.close();
	}
}