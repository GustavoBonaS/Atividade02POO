import java.util.Scanner;

//2. Fa�a um Programa que pe�a um valor e mostre na tela se o valor � positivo, negativo ou zero.
public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ent = new Scanner(System.in);
		
		System.out.println("Insira um numero: ");
		int num = ent.nextInt();
		
		if (num > 0)
			System.out.println("O numero � Positivo");
		else if ( num < 0)
			System.out.println("O numero � Negativo");
		else
			System.out.println("O numero � igual a Zero");
				
		ent.close();
	}

}
