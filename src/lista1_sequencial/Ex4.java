package lista1_sequencial;
import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		//Fa�a um Programa que pe�a as 4 notas bimestrais e mostre a m�dia.
		Scanner scan = new Scanner(System.in);
		float soma = 0;
		for (int i = 0;i<=3;i++) {
			System.out.print("Informe nota do m�s "+(i+1)+":");
			float num = scan.nextFloat();
			soma += num;
		}
		float media = (soma/4);
		System.out.println("Soma: "+media);
		scan.close();
	}
}
