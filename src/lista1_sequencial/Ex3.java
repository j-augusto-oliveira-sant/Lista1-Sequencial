package lista1_sequencial;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		//Fa�a um Programa que pe�a dois n�meros e imprima a soma.
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[2];
		for (int i = 0;i<=1;i++) {
			System.out.print("Informe n�mero: ");
			int num = scan.nextInt();
			nums[i] = num;
		}
		System.out.println("Soma: "+(nums[0]+nums[1]));
		scan.close();
	}
}
