package lista1_sequencial;
import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		//Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas
		//trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido m�s.
		Scanner scan = new Scanner(System.in);
		System.out.println("Valor da Hora (reais): ");
		float valor_hora = scan.nextFloat();
		System.out.println("Horas Trabalhadas: ");
		float horas = scan.nextFloat();
		System.out.println("R$ "+(valor_hora*horas));
		scan.close();
	}
}
