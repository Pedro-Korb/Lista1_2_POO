import java.util.Scanner;

public class Ex49 {

	public static void main(String[] args) {
		// Supermarket

		Scanner input = new Scanner(System.in);
		
		int nota = 0;
		
		System.out.println("Digite as respostas da sua prova:");
		
		System.out.println("Q1: ");
		char q1  = input.nextLine().charAt(0);
		
		System.out.println("Q2: ");
		char q2  = input.nextLine().charAt(0);
		
		System.out.println("Q3: ");
		char q3  = input.nextLine().charAt(0);
		
		System.out.println("Q4: ");
		char q4  = input.nextLine().charAt(0);
		
		System.out.println("Q5: ");
		char q5  = input.nextLine().charAt(0);
		
		System.out.println("Q6: ");
		char q6  = input.nextLine().charAt(0);
		
		System.out.println("Q7: ");
		char q7  = input.nextLine().charAt(0);
		
		System.out.println("Q8: ");
		char q8  = input.nextLine().charAt(0);
		
		System.out.println("Q9: ");
		char q9  = input.nextLine().charAt(0);
		
		System.out.println("Q10: ");
		char q10  = input.nextLine().charAt(0);
		
		if (q1 == 'a' || q1 == 'A')
		{
			System.out.println("Q1: " + q1 + " -> Correto");
			nota +=1;
		}
		else
		{
			System.out.println("Q1: " + q1 + " -> Errada. Correta: a");
		}
		
		if (q2 == 'a' || q2 == 'A')
		{
			System.out.println("Q2: " + q2 + " -> Correto");
			nota +=1;
		}
		else
		{
			System.out.println("Q2: " + q2 + " -> Errada. Correta: a");
		}
		
		if (q3 == 'b' || q3 == 'B')
		{
			System.out.println("Q3: " + q3 + " -> Correto");
			nota +=1;
		}
		else
		{
			System.out.println("Q3: " + q3 + " -> Errada. Correta: b");
		}
		
		if (q4 == 'b' || q4 == 'B')
		{
			System.out.println("Q4: " + q4 + " -> Correto");
			nota +=1;
		}
		else
		{
			System.out.println("Q4: " + q4 + " -> Errada. Correta: b");
		}
		
		if (q5 == 'c' || q5 == 'C')
		{
			System.out.println("Q5: " + q5 + " -> Correto");
			nota +=1;
		}
		else
		{
			System.out.println("Q5: " + q5 + " -> Errada. Correta: c");
		}
		
		if (q6 == 'c' || q6 == 'C')
		{
			System.out.println("Q6: " + q6 + " -> Correto");
			nota +=1;
		}
		else
		{
			System.out.println("Q6: " + q6 + " -> Errada. Correta: c");
		}
		
		if (q7 == 'd' || q7 == 'D')
		{
			System.out.println("Q7: " + q7 + " -> Correto");
			nota +=1;
		}
		else
		{
			System.out.println("Q7: " + q7 + " -> Errada. Correta: d");
		}
		
		if (q8 == 'd' || q8 == 'D')
		{
			System.out.println("Q8: " + q8 + " -> Correto");
			nota +=1;
		}
		else
		{
			System.out.println("Q8: " + q8 + " -> Errada. Correta: d");
		}
		
		if (q9 == 'e' || q9 == 'E')
		{
			System.out.println("Q9: " + q9 + " -> Correto");
			nota +=1;
		}
		else
		{
			System.out.println("Q9: " + q9 + " -> Errada. Correta: e");
		}
		
		if (q10 == 'e' || q10 == 'E')
		{
			System.out.println("Q10: " + q10 + " -> Correto");
			nota +=1;
		}
		else
		{
			System.out.println("Q10: " + q10 + " -> Errada. Correta: e");
		}
		
		System.out.println("Nota: " + nota);
		
		input.close();
	}
}