import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
Scanner ent = new Scanner(System.in);
		
		System.out.println("Insira um n�mero: ");
		int num1 = ent.nextInt();
		System.out.println("Insira outro n�mero: ");
		int num2 = ent.nextInt();
		System.out.println("Insira outro n�mero: ");
		int num3 = ent.nextInt();
		
		
		if (num1 > num2 && num1 > num3)
		System.out.println("O maior numero �: " + num1);
		
		else if (num2 > num1 && num2 > num3) 
			System.out.println("O maior numero �: " + num2);
		else if (num3 > num1 && num3 > num2)
			System.out.println("O maior numero �: " + num3);
		else
			System.out.println("Ambos s�o iguais");
		
		ent.close();
	}

}
