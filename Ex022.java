import java.util.Scanner;

public class Ex022 {

	public static void main(String[] args) {
		// Even or odd
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro: ");
		int par_impar = entrada.nextInt();
		int par_impar_alt  = (par_impar + 1);
		
		if (par_impar % 2 == 0)
		{
			System.out.println("O valor " + par_impar + " é par.");
			System.out.println("Mas agora virou ímpar --> " + par_impar_alt);
		}
		else
		{
			System.out.println("O valor " + par_impar + " é ímpar.");
			System.out.println("Mas agora virou par --> " + par_impar_alt);
		}
		
		entrada.close();

	}

}
