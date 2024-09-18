import java.util.Scanner;
public class Ex008 {

	public static void main(String[] args) {
		
		// Monthly salary
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Remuneração p/hora: ");
		float salario_hora = entrada.nextFloat();
		
		System.out.println("Horas trabalhadas por semana: ");
		float horas = entrada.nextFloat();
		
		float salario_mensal = (salario_hora * horas * 4);
		
		System.out.println("Salário mensal: R$" + salario_mensal);
		
		entrada.close();
	}

}
