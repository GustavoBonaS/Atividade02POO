import java.util.Scanner;

public class Questao14 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);

		System.out.println("Insira o numero correspondente da semana: ");
		int num = ent.nextInt();

		switch (num) {
		case 1: System.out.println("Domingo");
		break;

		case 2: System.out.println("Segunda");
		break;

		case 3: System.out.println("Ter�a");
		break;

		case 4: System.out.println("Quarta");
		break;
		
		case 5: System.out.println("Quinta");
		break;

		case 6:System.out.println("Sexta");
		break;

		case 7: System.out.println("Sabado");
		break;

		default:System.out.println("Dia Invalido");
		}

		ent.close();
	}

}
