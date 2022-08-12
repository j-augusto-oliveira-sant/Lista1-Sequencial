package lista1_sequencial;
import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Peso Ideal
		System.out.println("Altura (metros):");
		float fnum = scan.nextFloat();
		System.out.println("Peso Ideal:"+((72.7*fnum)-58)+"kg");
		scan.close();
	}
}
