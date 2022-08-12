package lista1_sequencial;
import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		//Faça um Programa que converta metros para centímetros.
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe medida em Metros:");
		float medida_metros = scan.nextFloat();
		float medida_centimetros = medida_metros*100;
		System.out.println(medida_centimetros+"cm");
		scan.close();
	}
}
