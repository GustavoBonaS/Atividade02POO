//1. Faça um Programa que peça dois números e imprima o maior deles.

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		int num1 = ent.nextInt();
		System.out.println("Insira outro número: ");
		int num2 = ent.nextInt();
		
		if (num1 > num2)
		System.out.println("O maior numero é: " + num1);
		if (num1 < num2)
			System.out.println("O maior numero é: " + num2);
		
		else
			System.out.println("Ambos são iguais");
		
		ent.close();
	}

}
