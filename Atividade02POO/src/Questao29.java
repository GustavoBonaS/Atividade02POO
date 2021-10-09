import java.util.Scanner;

public class Questao29 {

	public static void main(String[] args) {
		
		 Scanner ent = new Scanner(System.in);
		 
		 System.out.print("G-gasolina ou A-Alcool");
		 char comb = ent.next().charAt(0);
		 
		 System.out.print("Quantos litros?");
		 double lt = ent.nextDouble();
		 double desconto;
		 double prealc = 1.90;
		 double pregas = 2.50;
		 double precofinal = 0;
		 
		 if (comb == 'a' || comb == 'A') {
			if (lt < 20) {
				precofinal = (lt*prealc);
				desconto = precofinal*0.03;
				precofinal = precofinal-desconto;
				
				System.out.println("Valor a ser pago: "+precofinal);
			}else if (lt > 20) {
				precofinal = (lt*prealc);
				desconto = precofinal*0.05;
				precofinal = precofinal-desconto;
				
				System.out.println("Valor a ser pago: "+precofinal);
			}
			
		 }else if ( comb == 'G' || comb == 'g') {
			 if (lt < 20) {
					precofinal = (lt*pregas);
					desconto = precofinal*0.04;
					precofinal = precofinal-desconto;
					
					System.out.println("Valor a ser pago: "+precofinal);
			 }else if (lt > 20) {
					precofinal = (lt*pregas);
					desconto = precofinal*0.06;
					precofinal = precofinal-desconto;
					
					System.out.println("Valor a ser pago: "+precofinal);
			 }
			 
		 }
		 
		ent.close();			
			}
				
	}

