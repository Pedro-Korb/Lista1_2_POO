import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		
		// Sum of values
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int num1 = ent.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int num2 = ent.nextInt();
		
		int soma = (num1 + num2);
		System.out.println(num1 + " + " + num2 + " = " + soma);
		ent.close();
	}

}
