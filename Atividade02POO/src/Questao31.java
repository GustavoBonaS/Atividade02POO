import java.util.Scanner;

public class Questao31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);

		System.out.println("Digite a carne desejada: 1-FILÉ DUPLO, 2-ALCATRA, 3-PICANHA");
		int carne = ent.nextInt();

		System.out.println("Digite quantos kilos: ");
		double kg = ent.nextDouble();

		System.out.println("Deseja pagar com o Cartão Tabajara? TRUE ou FALSE");
		boolean cartao = ent.nextBoolean();

		double preco = 0;
		double desconto = 0;
		double precototal = 0;
		
		if ((carne==1) && (kg < 5)) {
			preco = kg * 4.90;

		}else { 
			preco = kg * 5.80;
		}
		if ((carne==2) && (kg < 5)) {
			preco = kg * 5.90;

		}else {
			preco = kg * 6.80;
		}
		if ((carne==3) && (kg < 5)) {
			preco = kg * 6.90;

		}else {
			preco = kg * 7.80; 
		}
		
		if (cartao == true) {
			
			desconto = preco*0.05;
			precototal = preco - desconto;
			
		}else {
				precototal = preco;
		}
		
		System.out.println("NOTA FISCAL");
		System.out.println("TIPO DA CARNE: " +carne);
		System.out.println("VALOR TOTAL: "+preco);
		System.out.println("TIPO DE PAGAMENTO "+cartao);
		System.out.println("DESCONTOS: "+desconto);
		System.out.println("VALOR A SER PAGO: "+precototal);
		
	}

}


