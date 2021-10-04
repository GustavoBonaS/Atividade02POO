import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Insira um ano: ");
		int ano = ent.nextInt();
		
		if ( ano % 4 == 0 )
		System.out.println("Ano Bissesto");
		
		else
		System.out.println("Não é um ano bissesto");
		
		ent.close();
	}

}
