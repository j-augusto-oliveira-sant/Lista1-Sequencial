package lista1_sequencial;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		//Faça um Programa que peça um número e então mostre a mensagem
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("O número informado foi: "+num);
		scan.close();
	}
}
