import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);

		System.out.println("Informe o seu salario: ");	
		double salario = ent.nextFloat();

		double reajuste = 0;

		if (salario <= 280.00) {
			reajuste = (salario * 0.20);
			System.out.println("Salario antes do reajuste: "+salario);
			System.out.println("Foi aplicado 20% de aumento");
			System.out.println("Total aumentado foi: "+ reajuste);
			System.out.println("Salário total após aumento: " +(reajuste + salario));

		}else if	(280.00 < salario && salario <= 700.00) {
			reajuste = salario * 0.15;
			System.out.println("Salario antes do reajuste: "+salario);
			System.out.println("Foi aplicado 15% de aumento");
			System.out.println("Total aumentado foi: "+ reajuste);
			System.out.println("Salário total após aumento: " +(reajuste + salario));

		}else if (700.00 < salario && salario <= 1500.00) {
			reajuste = salario * 0.10;
			System.out.println("Salario antes do reajuste: "+salario);
			System.out.println("Foi aplicado 10% de aumento");
			System.out.println("Total aumentado foi: "+ reajuste);
			System.out.println("Salário total após aumento: " +(reajuste + salario));

		}else if (1500 < salario) {
			reajuste = salario * 0.05;
			System.out.println("Salario antes do reajuste: "+salario);
			System.out.println("Foi aplicado 05% de aumento");
			System.out.println("Total aumentado foi: "+ reajuste);
			System.out.println("Salário total após aumento: " +(reajuste + salario));

		}else
			System.out.println("Salario Incorreto");

		ent.close();

	}

}
