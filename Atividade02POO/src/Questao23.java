import java.util.Scanner;

public class Questao23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Digite a idade: ");
		int id1 = ent.nextInt();
		System.out.println("Digite a idade: ");
		int id2 = ent.nextInt();
		System.out.println("Digite a idade: ");
		int id3 = ent.nextInt();
		
		int media = (id1 + id2 + id3) / 3;
		
		if (media < 25) {
			System.out.println("Turma Jovem");
		
		}else if (media>= 25 && media<40){
			System.out.println("Turma Adulta");
		}
		
		
	}

}
