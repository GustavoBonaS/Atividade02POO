import java.util.Scanner;

//2. Faça um Programa que peça um valor e mostre na tela se o valor é positivo, negativo ou zero.
public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ent = new Scanner(System.in);
		
		System.out.println("Insira um numero: ");
		int num = ent.nextInt();
		
		if (num > 0)
			System.out.println("O numero é Positivo");
		else if ( num < 0)
			System.out.println("O numero é Negativo");
		else
			System.out.println("O numero é igual a Zero");
				
		ent.close();
	}

}
