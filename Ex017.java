import java.util.Scanner;

public class Ex017 {

	public static void main(String[] args) {
		// Greater value
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor (inteiro): ");
		int num1 = entrada.nextInt();
		
		System.out.println("Digite o segundo valor (inteiro): ");
		int num2 = entrada.nextInt();
		
		if (num1 > num2)
		{
			System.out.println("Maior valor: " + num1);
		}
		else if(num1 < num2)
		{
			System.out.println("Maior valor: " + num2);
		}
		else
		{
			System.out.println("Os valores são iguais");
		}
		
		entrada.close();
	}

}
