import java.util.Scanner;

public class Ex028 {

	public static void main(String[] args) {
		// Salary increase

		Scanner input = new Scanner(System.in);

		double percentage = 0.0;
		double increase = 0.0;
		double new_salary = 0.0;

		System.out.println("Informe seu salário atual: R$");
		double salary = input.nextDouble();

		if (salary > 0 && salary <= 280.0)
		{
			percentage = 20;
		}
		else if (salary > 280.0 && salary <= 700.0)
		{
			percentage = 15;
		}
		else if (salary > 700.0 && salary <= 1500.0)
		{
			percentage = 10;
		}
		else if (salary > 1500.0 && salary <10000000.0)
		{
			percentage = 5;
		}
		else
		{
			System.out.println("Salário inválido");
		}

		increase = ((percentage/100) * salary);
		new_salary = salary + increase;
		
		System.out.println("Salário antes do reajuste: R$" + salary);
		System.out.println("Aumento percentual de " + percentage + "%");
		System.out.println("Aumento em dinheiro: R$" + increase);
		System.out.println("Salário atual: R$" + new_salary);

		input.close();
	}
}