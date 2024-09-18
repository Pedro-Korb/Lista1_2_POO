import java.util.Scanner;

public class Ex44 {

	public static void main(String[] args) {
		// Choose the number

		Scanner input = new Scanner(System.in);

		float valor = 0;

		System.out.println("1º número: ");
		float num1 = input.nextFloat();

		System.out.println("2º número: ");
		float num2 = input.nextFloat();

		System.out.println("Opção:\n[1] Somar (+)\n[2] Subtrair (-) \n[3] Multiplicar (x)\n[4] Dividir (/)");
		int choose1 = input.nextInt();

		if (choose1 == 1)
		{
			valor = num1 + num2;
		}
		else if (choose1 == 2)
		{
			valor = num1 - num2;
		}
		else if (choose1 == 3)
		{
			valor = num1 * num2;
		}
		else if (choose1 == 4)
		{
			valor = num1 / num2;
		}
		else
		{
			System.out.println("Operação inválida");
		}

		System.out.println("");
		
		System.out.println("Resultado: " + valor);
		
		System.out.println("");
		
		System.out.println("Opção para verificar:\n[1] Par ou ímpar\n[2] Positivo ou negativo \n[3] Inteiro ou decimal");
		int choose2 = input.nextInt();

		if ((choose1 >= 1 && choose1 <= 4) & choose2 == 1)
		{
			if (valor % 2 == 0)
			{
				System.out.println("O valor " + valor + " é PAR");
			}
			else
			{
				System.out.println("O valor " + valor + " é ÍMPAR");
			}
		}
		else if ((choose1 >= 1 && choose1 <= 4) & choose2 == 2)
		{
			if (valor > 0)
			{
				System.out.println("O valor " + valor + " é POSITIVO");
			}
			else if (valor == 0)
			{
				System.out.println("O valor " + valor + " é NULO");
			}
			else
			{
				System.out.println("O valor " + valor + " é NEGATIVO");
			}
		}
		else if ((choose1 >= 1 && choose1 <= 4) & choose2 == 3)
		{
			if (valor == Math.floor(valor))
			{
				System.out.println("O valor " + valor + " é INTEIRO");
			}
			else
			{
				System.out.println("O valor " + valor + " é DECIMAL");
			}
		}
		else
		{
			System.out.println("A escolha é inválida!");
		}

		input.close();
	}
}