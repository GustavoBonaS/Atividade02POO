//1. Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Insira um n�mero: ");
		int num1 = ent.nextInt();
		System.out.println("Insira outro n�mero: ");
		int num2 = ent.nextInt();
		
		if (num1 > num2)
		System.out.println("O maior numero �: " + num1);
		if (num1 < num2)
			System.out.println("O maior numero �: " + num2);
		
		else
			System.out.println("Ambos s�o iguais");
		
		ent.close();
	}

}
