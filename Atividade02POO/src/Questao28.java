import java.util.Scanner;

public class Questao28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);

		System.out.println("Insira um numero: ");
		float num1 = ent.nextFloat();

		System.out.println("Insira um numero: ");
		float num2 = ent.nextFloat();

		System.out.println("Digite o numero correspondete � opera��o desejada: 1-Soma 2-Subtra��o 3-Divis�o 4-Multiplica��o");
		int op = ent.nextInt();

		float resultado = 0;

		if (op == 1) {
			resultado = num1 + num2;
			System.out.println("Resultado: "+resultado);

			if  (resultado%2 == 0 )
				System.out.println("� par");
			else 
				System.out.println("� impar");

			if (resultado % 1 ==0) 
				System.out.println("� inteiro");

			else 
				System.out.println("� decimal");

			if (resultado> 0 )
				System.out.println("� positivo");

			else if (resultado < 0)
				System.out.println("� negativo");

		}else if (op==2) {
			resultado = num1 - num2;
			System.out.println("Resultado: "+resultado);

			if  (resultado%2 == 0 )
				System.out.println("� par");
			else 
				System.out.println("� impar");

			if (resultado % 1 ==0) 
				System.out.println("� inteiro");

			else 
				System.out.println("� decimal");

			if (resultado> 0 )
				System.out.println("� positivo");

			else if (resultado < 0)
				System.out.println("� negativo");

		}else if (op==3) {
			resultado = num1 / num2;
			System.out.println("Resultado: "+resultado);

			if  (resultado%2 == 0 )
				System.out.println("� par");
			else 
				System.out.println("� impar");

			if (resultado % 1 ==0) 
				System.out.println("� inteiro");

			else 
				System.out.println("� decimal");

			if (resultado> 0 )
				System.out.println("� positivo");

			else if (resultado < 0)
				System.out.println("� negativo");

		}else if (op==4) {
			resultado = num1*num2;
			System.out.println("Resultado: "+resultado);

			if  (resultado%2 == 0 )
				System.out.println("� par");
			else 
				System.out.println("� impar");

			if (resultado % 1 ==0) 
				System.out.println("� inteiro");

			else 
				System.out.println("� decimal");

			if (resultado> 0 )
				System.out.println("� positivo");

			else if (resultado < 0)
				System.out.println("� negativo");

		}else 
			System.out.println("Invalido");

		ent.close();
	}
}

