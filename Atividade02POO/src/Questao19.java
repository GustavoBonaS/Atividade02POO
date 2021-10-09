import java.util.Scanner;

public class Questao19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);

		System.out.println("Informe o valor de A:");
		double a = ent.nextDouble();

		if (a == 0) {
			System.out.println("A equação não é de segundo grau");

		} else {
			System.out.println("Insira o valor de B: ");
			double b = ent.nextDouble();

			System.out.println("Insira o valor de C: ");
			double c = ent.nextDouble();

			double delta = (b * b) - (4 * a * c);

			if (delta == 0) {
				System.out.println("A equação não é de segundo grau");

			} else if (delta < 0) {
				System.out.println("A equação não possui raizes");

			} else {
				double raiz1 = (-b + Math.sqrt(delta) / (2 * a));
				double raiz2 = (-b - Math.sqrt(delta) / (2 * a));
				System.out.println("Raiz 1: " + raiz1);
				System.out.println("Raiz 2: " + raiz2);

			}

		}
		ent.close();

	}

}
