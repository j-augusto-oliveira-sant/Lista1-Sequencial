package lista1_sequencial;
import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Peso Ideal homem e mulher
		System.out.println("Altura (metros):");
		float fnum = scan.nextFloat();
		char sex = 'p';
		scan.nextLine();
		while (sex != 'h' && sex != 'm') {
			System.out.println("Sexo: (h/m)");
			sex = scan.nextLine().charAt(0);
		}
		if (sex == 'h') {
			System.out.println("Peso Ideal:"+((72.7*fnum) - 58)+"kg");
		} else {
			System.out.println("Peso Ideal:"+((62.1*fnum) - 44.7)+"kg");
		}
		scan.close();
	}
}
