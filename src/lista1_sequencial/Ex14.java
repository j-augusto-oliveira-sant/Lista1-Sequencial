package lista1_sequencial;
import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Valor da Hora (reais): ");
		float valor_hora = scan.nextFloat();
		System.out.println("Horas Trabalhadas: ");
		float horas = scan.nextFloat();
		//S�lario Bruto
		float salario_bruto = (valor_hora*horas);
		System.out.println("+S�lario Bruto: R$"+salario_bruto);
		//- IR (11%) : R$
		float ir = (float) (salario_bruto*0.11);
		System.out.println("-IR: R$"+ir);
		//- INSS (8%) : R$
		float inss = (float) (salario_bruto*0.08);
		System.out.println("-INSS: R$"+inss);
		//- Sindicato ( 5%) : R$
		float sindicato = (float) (salario_bruto*0.05);
		System.out.println("-SINDICATO: R$"+sindicato);
		//= Sal�rio Liquido : R$
		System.out.println("Salario Liquido: R$"+(salario_bruto-ir-inss-sindicato));
		
		
		
		
		scan.close();
	}
}
