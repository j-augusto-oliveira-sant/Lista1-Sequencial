package lista1_sequencial;
import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		//Faça um Programa que pergunte quanto você ganha por hora e o número de horas
		//trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
		Scanner scan = new Scanner(System.in);
		System.out.println("Valor da Hora (reais): ");
		float valor_hora = scan.nextFloat();
		System.out.println("Horas Trabalhadas: ");
		float horas = scan.nextFloat();
		System.out.println("R$ "+(valor_hora*horas));
		scan.close();
	}
}
