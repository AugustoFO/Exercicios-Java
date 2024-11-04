/*Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em seguida, mostre na tela:
 * Todos os elementos dos índices ímpares do vetor 
 * Todos os elementos do vetor que são números pares
 * A Soma de todos os elementos do vetor
 * A Média de todos os elementos do vetor, armazenada em uma variável do tipo real*/

package VetoresMatrizes;
import java.util.Scanner;

@SuppressWarnings("resource")

public class Exercicio02Vetor {
	public static void main(String[] args) {
		
		int vetorNumeros[] = new int[10], somaNumeros = 0;
		String numerosPares = "", numerosImpares = "";
		float mediaNumeros = 0;
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < vetorNumeros.length; i++) {
			
			System.out.println("Digite o " + (i + 1) + "º número: ");
			vetorNumeros[i] = input.nextInt();
		}
		
		for (int i = 0; i < vetorNumeros.length; i++) {
			
			somaNumeros += vetorNumeros[i];
			
			if (vetorNumeros[i] % 2 == 0) {
				
				numerosPares += vetorNumeros[i] + " ";	
			}
			else {
				
				numerosImpares += vetorNumeros[i] + " ";
			}
		}
		
		mediaNumeros = (float) somaNumeros / 10;
		
		System.out.println("Elementos nos índices ímpares: " + numerosImpares);
		System.out.println("Elementos nos índices pares: " + numerosPares);
		System.out.println("Soma: " + somaNumeros);
		System.out.println("Média: " + mediaNumeros);
		
	}

}
