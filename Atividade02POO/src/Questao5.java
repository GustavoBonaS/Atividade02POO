import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Digite um letra: ");
		char letra = ent.next().charAt(0);
		
	switch (letra) {
	case 'a':
		System.out.println("É vogal");
		break;
	case 'e':
		System.out.println("É vogal");
		break;
	case 'i':
		System.out.println("É vogal");
		break;
	case 'o':
		System.out.println("É vogal");
		break;
	case 'u':
		System.out.println("É vogal");
		break;
		
		default:
			System.out.println("Não é vogal");
			break;
		
	}
	
	ent.close();
	
	}

}
