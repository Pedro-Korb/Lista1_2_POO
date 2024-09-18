import java.util.Scanner;

public class Ex023 {

	public static void main(String[] args) {
		// Descending order
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor inteiro: ");
		int num1 = ent.nextInt();
		
		System.out.println("Digite o segundo valor inteiro: ");
		int num2 = ent.nextInt();
		
		System.out.println("Digite o terceiro valor inteiro: ");
		int num3 = ent.nextInt();
		
		if (num1 >= num2 && num2 >= num3)
		{
			System.out.println(num1 + " " + num2 + " " + num3);
		}
		else if (num2 >= num1 && num1 >= num3)
		{
			System.out.println(num2 + " " + num1 + " " + num3);
		}
		else if (num1 >= num3 && num3 >= num2)
		{
			System.out.println(num1 + " " + num3 + " " + num2);
		}
		else if (num2 >= num3 && num3 >= num1)
		{
			System.out.println(num2 + " " + num3 + " " + num1);
		}
		else if (num3 >= num1 && num1 >= num2)
		{
			System.out.println(num3 + " " + num1 + " " + num2);
		}
		else if (num3 >= num2 && num2 >= 1)
		{
			System.out.println(num3 + " " + num2 + " " + num1);
		}
		
		ent.close();
	}

}
