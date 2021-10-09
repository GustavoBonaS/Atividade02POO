import java.util.Scanner;

public class Questao21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);

		System.out.println("Insira a data dd/mm/aaaa: ");
		int dia = ent.nextInt();
		int mes = ent.nextInt();
		int ano = ent.nextInt();

		if (ano > 9999) {
			if (mes >= 1 && mes <=12) {
				if ((dia >= 1 && dia <= 31) && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12))
					System.out.println("data valida");			
				
				else if ((dia >= 1 && dia <= 30) && (mes == 4 || mes == 6 || mes == 9 || mes == 11))
				System.out.println("Data valida");
				
				else if ((dia >=1 && dia <= 28) && (mes == 2))
					System.out.println("Data valida");
				
				else if ((dia == 29 && mes==2) && (ano % 4 == 0 ))
				System.out.println("Data valida");					

			}
			System.out.println("Data Invalida");
		}
		System.out.println("Data Invalida");
	
		ent.close();
	}

}


