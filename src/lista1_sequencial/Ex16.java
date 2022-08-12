package lista1_sequencial;
import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//TAMANHO EM METROS QUADRADOS
		System.out.println("Area para pintar (metros quadrados):");
		float area = scan.nextFloat();
		//1l tinta = 6m,
		float litros_tinta = area/6;
		//preço dos galões|galões de 3,6 litros, que custam R$ 25,00.
		int galoes = 0;
		float litros_galao=0;
		while (litros_galao<litros_tinta) {
			galoes += 1;
			litros_galao += 3.6;
		}
		//preço das latas| 1 lata = 18l de $80
		int latas = 0;
		float litros_latas=0;
		while (litros_latas<litros_tinta) {
			latas += 1;
			litros_latas += 18;
		}
		float preco_galoes = galoes*25;
		System.out.println("Total Litros Necessarios:"+litros_tinta);
		System.out.println("Preço em Galões: R$ "+preco_galoes);
		System.out.println("Galões| Litros Tinta:"+litros_galao);
		float preco_latas = latas*80;
		System.out.println("Preço em Latas: R$ "+preco_latas);
		System.out.println("Latas| Litros Tinta:"+litros_latas);
		
		scan.close();
	}
}
