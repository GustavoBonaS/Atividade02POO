import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Insira uma nota: ");
		float nota1 = ent.nextFloat();
		
		System.out.print("Insira outra nota: ");
		float nota2 = ent.nextFloat();
		
		double media = ((nota1 + nota2) / 2);
		
		if (media > 7)
			System.out.println("Aprovado");
	
		else 
		System.out.println("Reprovado");
		
		ent.close();
		
	}
	

}
