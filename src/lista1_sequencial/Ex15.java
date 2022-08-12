package lista1_sequencial;
import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//TAMANHO EM METROS QUADRADOS
		System.out.println("Area para pintar (metros quadrados):");
		float area = scan.nextFloat();
		//1l tinta = 3m,
		float litros_tinta = area/3;
		//preço das latas| 1 lata = 18l de $80
		int latas = 0;
		float litros_latas=0;
		while (litros_latas<litros_tinta) {
			latas += 1;
			litros_latas += 18;
		}
		System.out.println("Total Litros Necessarios:"+litros_tinta);
		float preco_latas = latas*80;
		System.out.println("Preço em Latas: R$ "+preco_latas);
		System.out.println("Latas| Litros Tinta:"+litros_latas);
		
		scan.close();
	}
}
