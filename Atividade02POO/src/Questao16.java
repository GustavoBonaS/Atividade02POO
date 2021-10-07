import java.util.Scanner;

public class Questao16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Insira uma nota: ");
		float nota1 = ent.nextFloat();
		
		System.out.print("Insira outra nota: ");
		float nota2 = ent.nextFloat();
		
		double media = ((nota1 + nota2) / 2);
		
		if (media < 3) 
			System.out.println("Reprovado");
		
		else if (media > 3 && media < 6.9)
		System.out.println("Em exame");
		
		else if (media > 7 && media < 10)
		System.out.println("Aprovado");
		
		ent.close();
	}

}
