import java.util.Scanner;


public class Ex002 {

	public static void main(String[] args) {
		
		// Entered value
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int numI = ent.nextInt();
		
		System.out.println("O valor digitado foi: " + numI);
		
		ent.close();
	}

}
