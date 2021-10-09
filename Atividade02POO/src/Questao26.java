import java.util.Scanner;

public class Questao26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ent = new Scanner(System.in);
		
		System.out.print("Insira um numero");
		int num = ent.nextInt();
		
		if (num%2 == 0 )
			System.out.println("É par");
		else 
			System.out.println("É impar");
		ent.close();
	}

}
