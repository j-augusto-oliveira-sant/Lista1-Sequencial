package lista1_sequencial;
import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		//Fa�a um Programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea.
		Scanner scan = new Scanner(System.in);
		System.out.println("Raio do c�rculo (metros):");
		float raio = scan.nextFloat();
		System.out.println((3.1415*(raio*raio))+" metros");
		scan.close();
	}
}
