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
			System.out.println("É um equilátero");
		
		else if (lado1 == lado2 || lado1 == lado3 || lado3==lado2)
			System.out.println("É um isóceles");
		
		else if (lado1 != lado2 || lado1 != lado3 || lado3!=lado2)
			System.out.println("É um escaleno");
		
		ent.close();
	}

}
