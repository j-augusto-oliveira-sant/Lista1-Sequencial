package lista1_sequencial;
import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
		Scanner scan = new Scanner(System.in);
		System.out.println("Raio do círculo (metros):");
		float raio = scan.nextFloat();
		System.out.println((3.1415*(raio*raio))+" metros");
		scan.close();
	}
}
