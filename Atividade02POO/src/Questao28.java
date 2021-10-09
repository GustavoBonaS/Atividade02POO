import java.util.Scanner;

public class Questao28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);

		System.out.println("Insira um numero: ");
		float num1 = ent.nextFloat();

		System.out.println("Insira um numero: ");
		float num2 = ent.nextFloat();

		System.out.println("Digite o numero correspondete à operação desejada: 1-Soma 2-Subtração 3-Divisão 4-Multiplicação");
		int op = ent.nextInt();

		float resultado = 0;

		if (op == 1) {
			resultado = num1 + num2;
			System.out.println("Resultado: "+resultado);

			if  (resultado%2 == 0 )
				System.out.println("É par");
			else 
				System.out.println("É impar");

			if (resultado % 1 ==0) 
				System.out.println("É inteiro");

			else 
				System.out.println("É decimal");

			if (resultado> 0 )
				System.out.println("É positivo");

			else if (resultado < 0)
				System.out.println("É negativo");

		}else if (op==2) {
			resultado = num1 - num2;
			System.out.println("Resultado: "+resultado);

			if  (resultado%2 == 0 )
				System.out.println("É par");
			else 
				System.out.println("É impar");

			if (resultado % 1 ==0) 
				System.out.println("É inteiro");

			else 
				System.out.println("É decimal");

			if (resultado> 0 )
				System.out.println("É positivo");

			else if (resultado < 0)
				System.out.println("É negativo");

		}else if (op==3) {
			resultado = num1 / num2;
			System.out.println("Resultado: "+resultado);

			if  (resultado%2 == 0 )
				System.out.println("É par");
			else 
				System.out.println("É impar");

			if (resultado % 1 ==0) 
				System.out.println("É inteiro");

			else 
				System.out.println("É decimal");

			if (resultado> 0 )
				System.out.println("É positivo");

			else if (resultado < 0)
				System.out.println("É negativo");

		}else if (op==4) {
			resultado = num1*num2;
			System.out.println("Resultado: "+resultado);

			if  (resultado%2 == 0 )
				System.out.println("É par");
			else 
				System.out.println("É impar");

			if (resultado % 1 ==0) 
				System.out.println("É inteiro");

			else 
				System.out.println("É decimal");

			if (resultado> 0 )
				System.out.println("É positivo");

			else if (resultado < 0)
				System.out.println("É negativo");

		}else 
			System.out.println("Invalido");

		ent.close();
	}
}

