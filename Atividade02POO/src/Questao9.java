import java.util.Scanner;

public class Questao9 {

	public static void main(String[] args) {
	
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Insira a sua altura: ");
		double altura = ent.nextDouble();
		
		System.out.println("Insira o seu peso: ");
		double peso = ent.nextDouble();
		
		System.out.println("Insira M para Masculino ou F para Feminino");
		char sexo = ent.next().charAt(0);
		
		double pesoideal;
		
		switch(sexo) {
		case 'M':
			System.out.println("Masculino");
			System.out.println("Seu peso" + peso);
			System.out.println("Sua altura" + altura);
			pesoideal = (72.2 * altura) - 58;
			System.out.println("O peso ideal �:" + pesoideal);
			if (pesoideal > peso)
				System.out.println("Voc� est� abaixo do peso ideal ");
			else if (pesoideal < peso)
				System.out.println("Voc� est� acima do peso ideal");
			else
				System.out.println("Voc� est� no peso ideal");
			break;
			
		case 'F':
			System.out.println("Feminino");
			System.out.println("Seu peso" + peso);
			System.out.println("Sua altura" + altura);
			pesoideal = (62.1 * altura) - 44.7;
			System.out.println("O peso ideal �:" + pesoideal);
			if (pesoideal > peso)
				System.out.println("Voc� est� abaixo do peso ideal");
			else if (pesoideal < peso)
				System.out.println("Voc� est� acima do peso ideal");
			else
				System.out.println("Voc� est� no peso ideal");
			break;
			
			
		default: 
			System.out.println("Invalido");
		break;
		}
		 ent.close();

		
	}

}
