import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
Scanner ent = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		int num1 = ent.nextInt();
		System.out.println("Insira outro número: ");
		int num2 = ent.nextInt();
		System.out.println("Insira outro número: ");
		int num3 = ent.nextInt();
		
		
		if (num1 > num2 && num1 > num3)
		System.out.println("O maior numero é: " + num1);
		
		else if (num2 > num1 && num2 > num3) 
			System.out.println("O maior numero é: " + num2);
		else if (num3 > num1 && num3 > num2)
			System.out.println("O maior numero é: " + num3);
		else
			System.out.println("Ambos são iguais");
		
		ent.close();
	}

}
