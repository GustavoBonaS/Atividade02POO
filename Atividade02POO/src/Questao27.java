import java.util.Scanner;

public class Questao27 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		System.out.print("Insira um numero");
		float num = ent.nextFloat();
		
		if (num % 1 ==0) {
		System.out.println("É inteiro");
		
		}else {
			System.out.println("É decimal");
		}
		
		System.out.println("Numero arredondado: " +Math.ceil(num));
		ent.close();
		
	} 

}
