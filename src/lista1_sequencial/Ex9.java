package lista1_sequencial;
import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		//Fa�a um Programa que pe�a a temperatura em graus Farenheit, 
		//transforme e mostre a temperatura em graus Celsius.
		Scanner scan = new Scanner(System.in);
		System.out.println("Temperatura (Farenheit): ");
		float temperatura = scan.nextFloat();
		System.out.println(((temperatura-32)/1.8)+" celsius");
		scan.close();
	}
}
