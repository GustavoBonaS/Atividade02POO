import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
	
		System.out.println("Insira um numero: ");
		int num1 = ent.nextInt();
		
		System.out.println("Insira um numero: ");
		int num2 = ent.nextInt();
		
		System.out.println("Insira um numero: ");
		int num3 = ent.nextInt();
		
		if (num1 > num2 && num2 > num3) {
		System.out.println(+num1);	
		System.out.println(+num2);
		System.out.println(+num3);
		}else if (num1 > num3 && num3 > num2) {
			System.out.println(+num1);	
			System.out.println(+num3);
			System.out.println(+num2);
		}else if (num2 > num1 && num1 > num3) {
			System.out.println(+num2);	
			System.out.println(+num1);
			System.out.println(+num3);
		}else if (num2 > num3 && num3 > num1) {
			System.out.println(+num2);	
			System.out.println(+num3);
			System.out.println(+num1);
		}else if (num3 > num2 && num2 > num1) {
			System.out.println(+num3);	
			System.out.println(+num2);
			System.out.println(+num1);
		}else if (num3 > num1 && num1 > num2) {
			System.out.println(+num3);	
			System.out.println(+num1);
			System.out.println(+num2);
		}
		ent.close();
		
	}

}
