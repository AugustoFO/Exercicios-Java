/*Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e mostre na tela quantos números são pares e quantos número 
 * são ímpares. */

package LacosRepeticao;
import java.util.Scanner;

@SuppressWarnings("resource")

public class Exercicio02For {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int contador, numero, nPares = 0, nImpares = 0;
		
		for (contador = 1; contador < 11; contador++) {
			
			System.out.println("Digite o " + contador + "º número: ");
			numero = input.nextInt();
			
			if(numero % 2 == 0){
				
				nPares++;
			}
			else {
				
				nImpares++;
			}
		}
		
		input.close();
		
		System.out.println("Total de números pares: " + nPares);
		System.out.println("Total de números ímpares: " + nImpares);
		
	}
	
}
