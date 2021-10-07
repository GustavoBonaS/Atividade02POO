import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);

		System.out.print("Digite o valor de hora trabalhada: ");
		double valorhora = ent.nextInt();

		System.out.print("Digite o numero de horas trabalhados no mes: ");
		double hora = ent.nextDouble();

		double inss = 0.10;
		double ir = 0.05;
		double fgts = 0.11;
		double sind = 0.03;
		double salariol;
		double salariob = valorhora * hora;

		if (salariob <= 900)
			System.out.println("Você é isento");

		else if (salariob > 900 && salariob <= 1500) {
			System.out.println("Salario bruto: "+salariob);
			System.out.println("Imposto de renda: "+(ir*salariob));
			System.out.println("Inss: "+(salariob*inss));
			System.out.println("FGTS: "+(salariob*fgts));
			System.out.println("Sindicato: "+(salariob*sind));
			System.out.println("Total de descontos: "+(inss+ir+sind));
			salariol = (salariob-inss-ir-sind);
			System.out.println("Salario liquido: "+salariol);
		}
		else if (salariob > 1500 && salariob <= 2500) {
			System.out.println("Salario bruto: "+salariob);
			System.out.println("Imposto de renda: "+(ir*salariob));
			System.out.println("Inss: "+(salariob*inss));
			System.out.println("FGTS: "+(salariob*fgts));
			System.out.println("Sindicato: "+(salariob*sind));
			System.out.println("Total de descontos: "+(inss+ir+sind));
			double desconto=0.20;
			salariol = (salariob-inss-ir-sind);
			System.out.println("Salario liquido: "+(salariol/desconto));
		}

ent.close();

	}

}
