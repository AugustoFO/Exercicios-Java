package OperadoresVariaveis;
import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		float n01 = leia.nextFloat();
	
		System.out.println("Digite o segundo número: ");
		float n02 = leia.nextFloat();
	
		System.out.println("Digite o terceiro número: ");
		float n03 = leia.nextFloat();
	
		System.out.println("Digite quarto número: ");
		float n04 = leia.nextFloat();
		
		float produto01 = n01 * n02;
		float produto02 = n03 * n04;
		
		float difProdutos = produto01 - produto02;
		
		System.out.println("A diferença do produto entre n1 e n2 pelo produto entre n3 e n4 é: " + difProdutos);
		
		leia.close();
	}

}
