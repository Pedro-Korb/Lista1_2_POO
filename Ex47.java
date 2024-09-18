import java.util.Scanner;

public class Ex47 {

	public static void main(String[] args) {
		// Fruits at the fair
 
		Scanner input = new Scanner(System.in);
		
		double precoMorango;
		double precoMaca;
		
        System.out.print("Quantidade (Kg) de morangos: ");
        double kgMorango = input.nextDouble();

        System.out.print("Quantidade (Kg) de maçãs: ");
        double kgMaca = input.nextDouble();

        
        if (kgMorango <= 5) 
        {
            precoMorango = 2.50;
        } else 
        {
            precoMorango = 2.20;
        }

        if (kgMaca <= 5) 
        {
            precoMaca = 1.80;
        } else 
        {
            precoMaca = 1.50;
        }

        double totalMorango = kgMorango * precoMorango;
        double totalMaca = kgMaca * precoMaca;
        double total = totalMorango + totalMaca;

        double totalKg = kgMorango + kgMaca;
        if (totalKg > 8 || total > 25) 
        {
            total =  total * 0.90; 
        }

        System.out.printf("O valor a ser pago é: R$" + total);
        
        input.close();
	}
}