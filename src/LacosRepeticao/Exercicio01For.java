/*Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o primeiro número deve ser menor do que o segundo número. 
 * Caso contrário, deve ser exibida uma mensagem na tela informando que o intervalo é inválido e sair do programa. No intervalo informado, 
 * mostre na tela todes os números que são múltiplos de 3 e 5.*/

package LacosRepeticao;
import java.util.Scanner;

public class Exercicio01For {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("--------------------------------------------------=");
		System.out.println(" Verificação de múltiplos de 5 e 3 detre intervalo ");
		System.out.println("--------------------------------------------------=");
		System.out.println(" Insira o primeiro valor inteiro: ");
		int numero01 = input.nextInt();
		System.out.println(" Insira o segundo valor inteiro: ");
		int numero02 = input.nextInt();
		
		input.close();
		
		if (numero01 < numero02) {
			
			for (; numero01 <= numero02; numero01++) {
				
				if (numero01 % 3 == 0 && numero01 % 5 == 0) {
					
					System.out.println(numero01 + " é múltiplo de 3 e 5");
				}
			}
		}
		else {
			System.out.println("Intervalo inválido! ");
		}
		
	}

}
