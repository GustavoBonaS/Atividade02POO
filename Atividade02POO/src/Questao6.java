import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ent = new Scanner(System.in);
			
		System.out.println("Insira um numero: ");
		int num = ent.nextInt();
		
		if ( num % 2 == 0 )
		System.out.println("Numero convertido: " + (num +1) );
		
		else
		System.out.println("Numero convertido: " + (num + 1) );
		
		ent.close();
		
		
		
	}

}
