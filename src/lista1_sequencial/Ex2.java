package lista1_sequencial;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		//Fa�a um Programa que pe�a um n�mero e ent�o mostre a mensagem
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("O n�mero informado foi: "+num);
		scan.close();
	}
}
