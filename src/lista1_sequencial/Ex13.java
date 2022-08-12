package lista1_sequencial;
import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Joao Papo de peixe
		System.out.println("Kg Peixe:");
		float quilo_peixe = scan.nextFloat();
		int multa = 0;
		if (quilo_peixe > 50) {
			multa += (quilo_peixe-50)*4;
		}
		if (multa > 0) {
			System.out.println("Multa: R$"+multa);
		} else {
			System.out.println("Multa: ZERO");
		}
		scan.close();
	}
}
