package lista1_sequencial;
import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//peça 2 números inteiros e um número real.
		System.out.println("Inteiro:");
		int num1 = scan.nextInt();
		System.out.println("Inteiro 2:");
		int num2 = scan.nextInt();
		System.out.println("Float:");
		float fnum = scan.nextFloat();
		System.out.println("o produto do dobro do primeiro com metade do segundo: "
		+(2*num1)*(num2/2));
		System.out.println("a soma do triplo do primeiro com o terceiro: "
				+((3*num1)+fnum));
		System.out.println("o terceiro elevado ao cubo: "+Math.pow(fnum,3));
		
		scan.close();
	}
}
