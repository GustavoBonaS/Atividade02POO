import java.util.Scanner;

public class Questao18 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Insira um lado do triangulo: ");
		int lado1 = ent.nextInt();
		System.out.println("Insira um lado do triangulo: ");
		int lado2 = ent.nextInt();
		System.out.println("Insira um lado do trangulo: ");
		int lado3 = ent.nextInt();
		
		if (lado1 == lado2 && lado1 == lado2)
			System.out.println("� um equil�tero");
		
		else if (lado1 == lado2 || lado1 == lado3 || lado3==lado2)
			System.out.println("� um is�celes");
		
		else if (lado1 != lado2 || lado1 != lado3 || lado3!=lado2)
			System.out.println("� um escaleno");
		
		ent.close();
	}

}
