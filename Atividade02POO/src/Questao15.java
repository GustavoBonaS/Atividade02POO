import java.util.Scanner;

public class Questao15 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);

		System.out.print("Insira o pre�o de custo: ");
		int preco = ent.nextInt();
		System.out.print("Insira o C�digo de Origem: ");
		int cod = ent.nextInt();

		switch (cod) {
		case 1: System.out.println("Sul");
		System.out.println("Pre�o: "+preco);
		break;
		
		case 2: System.out.println("Norte");
		System.out.println("Pre�o: "+preco);
		break;
		
		case 3: System.out.println("Leste");
		System.out.println("Pre�o: "+preco);
		break;
		
		case 4: System.out.println("Oeste");
		System.out.println("Pre�o: "+preco);
		break;
		
		case 5 , 6: System.out.println("Nordeste");
		System.out.println("Pre�o: "+preco);
		break;
		
		case 7 , 8: System.out.println("Centro-oeste");
		System.out.println("Pre�o: "+preco);
		break;
		
		default:System.out.println("Importado");
		}

		ent.close();
	}


}
