package OperadoresVariaveis;
import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
	
		System.out.println("Média de notas do do participante.");
	
		System.out.println("Digite a primeira nota: ");
		float nota01 = leia.nextFloat();
	
		System.out.println("Digite a segunda nota: ");
		float nota02 = leia.nextFloat();
	
		System.out.println("Digite a terceira nota: ");
		float nota03 = leia.nextFloat();
	
		System.out.println("Digite a quarta nota: ");
		float nota04 = leia.nextFloat();
	
		float media =  Math.round(((nota01 + nota02 + nota03 + nota04) / 4) * 10) / 10.0f ; // Arredondei o valor utilizando Math.round
	
		System.out.print("A média final do participante é: " + media);
	
		leia.close();
	}
}