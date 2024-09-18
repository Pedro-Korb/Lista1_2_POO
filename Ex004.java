import java.util.Scanner;
public class Ex004 {

	public static void main(String[] args) {
		
		// Grade average
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		float nota1 = ent.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		float nota2 = ent.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		float nota3 = ent.nextFloat();
		
		System.out.println("Digite a quarta nota: ");
		float nota4 = ent.nextFloat();
		
		float media = ((nota1 + nota2 + nota3 + nota4) / 4);
		System.out.println("A média das quatro notas é igual a: " + media);
		
		ent.close();
	}

}
