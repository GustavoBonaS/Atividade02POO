/*3. Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra
escrever: F - Feminino, M - Masculino.*/

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ent = new Scanner(System.in);
		
		
		System.out.print("Digite F para Feminino ou M para Masculino: ");
		char sexo = ent.next().charAt(0);
		
		
		switch(sexo) {
		case 'M':
			System.out.println("Masculino");
			break;
			
		case 'F':
			System.out.println("Feminino");
			
		default: 
			System.out.println("Invalido");
		break;
		}
		 ent.close();
			
	}

}
