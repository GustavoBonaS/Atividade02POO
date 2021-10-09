import java.util.Scanner;

public class Questao32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Insira as notas: ");
		String r1 = scr.nextLine();
		String r2 = scr.nextLine();
		String r3 = scr.nextLine();
		String r4 = scr.nextLine();
		String r5 = scr.nextLine();
		String r6 = scr.nextLine();
		String r7 = scr.nextLine();
		String r8 = scr.nextLine();
		String r9 = scr.nextLine();
		String r10 = scr.nextLine();
		
		int nota = 0;
		
		if ("a".equalsIgnoreCase(r1)) {
			System.out.println("Q1: "+r1+": Correto");
		nota++;
		}else 
			System.out.println("Errado, resposta correta (a)");
		if ("a".equalsIgnoreCase(r2)) {
			System.out.println("Q2: "+r2+": Correto");
			nota++;
		}else 
			System.out.println("Errado, resposta correta (a)");
		if ("b".equalsIgnoreCase(r3)) {
			System.out.println("Q3: "+r3+": Correto");
			nota++;
		}else 
			System.out.println("Errado, resposta correta (b)");
		if ("b".equalsIgnoreCase(r4)) {
			System.out.println("Q4: "+r4+": Correto");
			nota++;
		}else 
			System.out.println("Errado, resposta correta (a)");
		if ("c".equalsIgnoreCase(r5)) {
			System.out.println("Q5: "+r5+": Correto");
			nota++;
		}else 
			System.out.println("Errado, resposta correta (a)");
		if ("c".equalsIgnoreCase(r6)) {
			System.out.println("Q6: "+r6+": Correto");
			nota++;
		}else 
			System.out.println("Errado, resposta correta (a)");
		if ("d".equalsIgnoreCase(r7)) {
			System.out.println("Q7: "+r7+": Correto");
			nota++;
		}else 
			System.out.println("Errado, resposta correta (a)");
		if ("d".equalsIgnoreCase(r8)) {
			System.out.println("Q8: "+r8+": Correto");
			nota++;
		}else 
			System.out.println("Errado, resposta correta (a)");
		if ("e".equalsIgnoreCase(r9)) {
			System.out.println("Q9: "+r9+": Correto");
			nota++;
		}else 
			System.out.println("Errado, resposta correta (a)");
		if ("e".equalsIgnoreCase(r10)) {
			System.out.println("Q10: "+r10+": Correto");
			nota++;
		}else 
			System.out.println("Errado, resposta correta (a)");
		
			System.out.println("Pontuação: "+nota);
			
			scr.close();
		
	}

}
