import java.util.Scanner;

public class Questao24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
	
		System.out.println("Digite a nota: ");
		double n1 = ent.nextInt();
		System.out.println("Digite a nota: ");
		double n2 = ent.nextInt();
		System.out.println("Digite a nota: ");
		double n3 = ent.nextInt();
		
		double media = (n1 + n2 + n3) / 3;
		
		if (media >= 7 && media <= 9.9) {
			System.out.println("Aprovado");
		
		}else if (media < 7){
			System.out.println("Reprovado");
			
		}else if (media == 10) {
			System.out.println("Aprovado com Distinção");
		}
		
		System.out.println("Invalido");
		
		ent.close();
	}
	

}
