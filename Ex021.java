import java.util.Scanner;

public class Ex021 {

	public static void main(String[] args) {
		// Is it a vowel or not
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		char letra = ent.nextLine().charAt(0);
		
		if (letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E' || letra == 'i' || letra == 'I' || letra == 'o' || letra == 'O' || letra == 'u' || letra == 'U')
		{
			System.out.println("A letra " + letra + " é uma vogal.");
		}
		else
		{
			System.out.println("A letra " + letra + " não é uma vogal");
		}
		
		ent.close();
	}

}
