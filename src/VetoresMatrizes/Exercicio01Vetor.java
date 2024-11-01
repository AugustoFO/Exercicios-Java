/*Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, construa um algoritmo que consiga pesquisar dados no vetor, 
 * onde o usuário irá digitar um número e o programa deve exibir na tela a posição deste número no vetor. Caso o número não seja encontrado, 
 * a mensagem: “Não foi encontrado!” deve ser exibida na tela.*/

package VetoresMatrizes;
import java.util.Scanner;

public class Exercicio01Vetor {
	
	public static void main(String[] args) {
		
		int arrayNumeros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6}, numeroBuscado, posicaoNumero = -1;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numeroBuscado = input.nextInt();
		
		input.close();
		
		for (int i = 0; i < arrayNumeros.length; i++) {
			
			if (arrayNumeros[i] == numeroBuscado) {
				
				posicaoNumero = i; 
	            break;
	            }
	    }
		
		if (posicaoNumero >= 0) {
			
			System.out.println("O número " + numeroBuscado + " está localizado na posição: " + posicaoNumero);
		}
		else {
			
			System.out.println("O número " + numeroBuscado + " não foi encontrado!");
		}
		

	} 
}


