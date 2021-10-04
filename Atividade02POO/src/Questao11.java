import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ent = new Scanner(System.in);
		
		System.out.print("Qual turno você estuda? M-Matutino, V-Vespertino ou N-Noturno: ");
		char turno = ent.next().charAt(0);
		
		
		switch(turno) {
		case 'M':
			System.out.println("Bom Dia!");
			break;
			
		case 'V':
			System.out.println("Boa Tarde!");
			break;
		case 'N':
			System.out.println("Boa Noite!");
			break;
		default: 
			System.out.println("Invalido");
		break;
		}
		 ent.close();
			
	}
		
		
	}


