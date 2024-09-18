import java.util.Scanner;

public class Ex014 {

	public static void main(String[] args) {
		// Salary discounts
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Salário p/ hora: ");
		float salario_hora = entrada.nextFloat();
		
		System.out.println("Horas trabalhadas p/ semana: ");
		float horas_semana = entrada.nextFloat();
		
		float salario_bruto = (salario_hora * horas_semana * 4);
		float ir = ((salario_bruto / 100) * 11);
		float inss = ((salario_bruto / 100) * 8);
		float sindicato = ((salario_bruto / 100) * 5);
		float salario_liquido = (salario_bruto - ir - inss - sindicato);
		float descontos = (ir + inss + sindicato);
		
		System.out.println("Salário bruto: R$" + salario_bruto);
		System.out.println("Imposto de renda: -R$" + ir);
		System.out.println("INSS: -R$" + inss);
		System.out.println("Sindicato: -R$" + sindicato);
		System.out.println("Descontos: -R$" + descontos);
		System.out.println("Salário líquido: R$" + salario_liquido);
		
		entrada.close();
	}

}
