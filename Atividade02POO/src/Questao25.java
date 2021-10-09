import java.util.Scanner;

public class Questao25 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite o valor do saque. (entre R$10,00 e R$600,00) ");
		int saque = ent.nextInt();
		
		int ncem =(saque / 100);
		saque = saque - (ncem*100);
		
		int ncinq= (saque / 50);
		saque = saque - (ncinq*50);
		
		int ndez = ( saque / 10);
		saque = saque - (ndez*10);
		
		int ncinco = ( saque / 5);
		saque = saque - (ncinco / 5);
		
		System.out.println("Notas de R$100: "+ncem);
		System.out.println("Notas de R$50: "+ncinq);
		System.out.println("Notas de R$10: "+ndez);
		System.out.println("Notas de R$5: "+ncinco);
		System.out.println("Notas de R$1: "+saque);
ent.close();



		
	}

}
