package lista1_sequencial;
import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		//Fa�a um Programa que calcule e mostre a �rea de um quadrado.
		Scanner scan = new Scanner(System.in);
		System.out.println("Medida Lado do Quadrado (metros):");
		float lado = scan.nextFloat();
		System.out.println((lado*lado)+" metros");
		scan.close();
	}
}
