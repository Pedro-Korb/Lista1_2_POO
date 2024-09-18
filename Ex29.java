import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		// Salary taxes
		
		Scanner input = new Scanner(System.in);
		
		double percentage_ir = 0;
		double ir = 0;
		double inss = 0;
		double fgts = 0;
		double sindicate = 0;
		double total_decrease = 0;
		double net_salary = 0;
		double salary = 0;
		
		System.out.println("Salário p/hora: ");
		double salary_hour = input.nextDouble();
		
		System.out.println("Horas trabalhadas p/semana: ");
		double week_hours = input.nextDouble();
		
		salary = salary_hour * week_hours * 4;
		
		if (salary > 0 && salary <= 900.0)
		{
			percentage_ir = 0;
		}
		else if (salary > 900 && salary <= 1500.0)
		{
			percentage_ir = 5;
		}
		else if (salary > 1500 && salary <= 2500)
		{
			percentage_ir = 10;
		}
		else if (salary > 2500 && salary <= 10000000.0)
		{
			percentage_ir = 20;
		}
		else
		{
			System.out.println("Salário inválido!");
		}
		
		ir = ((percentage_ir / 100) * salary);
		inss = 0.1 * salary;
		fgts = 0.11 * salary;
		sindicate = 0.03 * salary;
		total_decrease = ir + inss - sindicate;
		net_salary = salary - total_decrease;
		
		
		System.out.println("");
		System.out.println("Salário bruto:        R$" + salary);
		System.out.println("Imposto de renda:    -R$" + ir);
		System.out.println("INSS:                -R$" + inss);
		System.out.println("Sindicato:           -R$" + sindicate);
		System.out.println("FGTS:                 R$" + fgts);
		System.out.println("Total de descontos:   R$" + total_decrease);
		System.out.println("Salário líquido:      R$" + net_salary);
		
		input.close();
	}
}