import java.util.Scanner;

public class Questao22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);

		System.out.println("Insira um numero: ");
		int num = ent.nextInt();
		
		if (num <1000) {
			
			int uni = num % 10;
			
			num = (num - uni) / 10;
			
			int dez = num % 10;
			
			num = (num - dez)/10;
			int cent = num;
			
			System.out.println("Unidades: "+uni);
			System.out.println("Dezenas: "+dez);
			System.out.println("Centenas: " +cent);
		}else
		System.out.println("Numero invalido");
		ent.close();
	}

}
