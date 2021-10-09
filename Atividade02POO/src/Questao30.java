import java.util.Scanner;

public class Questao30 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);

		System.out.println("Quantos Kilos de morango?: ");
		double pesomorango = ent.nextDouble();

		System.out.println("Quantos kilos de maçã? ");
		double pesomaca = ent.nextDouble();

		double precomorango = 2.50;
		double precomaca = 1.80;
		double compratotal = 0;
		double pesototal = 0;
		double precomorangofinal = 0;
		double precomacafinal = 0;
		double desconto = 0;

		if (pesomorango < 5) {
			precomorangofinal = (pesomorango * precomorango);

		} else
			precomorango = precomorango - 0.30;
		precomorango = (precomorango * pesomorango);

		if (pesomaca < 5) {
			precomacafinal = (pesomaca * precomaca);

		} else {
			precomaca = precomaca - 0.30;
			precomacafinal = (precomaca * pesomaca);
		}
		compratotal = (precomacafinal + precomorangofinal);
		pesototal = (pesomaca + pesomorango);

		if (pesototal > 8 || compratotal > 25) {
			desconto = compratotal * 0.25;
			compratotal = compratotal - desconto;
			System.out.println("Valor: " + compratotal);

		} else {
			System.out.println("Valor: " + compratotal);
		}

		ent.close();

	}

}
