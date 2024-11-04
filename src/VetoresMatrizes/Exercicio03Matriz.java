/*Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
 *Todos os elementos da Diagonal Principal
 *Todos os elementos da Diagonal Secundária
 *A Soma de todos os elementos da Diagonal Principal
 *A Soma de todos os elementos da Diagonal Secundária*/

package VetoresMatrizes;
import java.util.Scanner;

@SuppressWarnings("resource")

public class Exercicio03Matriz {
	
	public static void main(String[] args) {
		
		int matriz[][] = new int[3][3], somaPrincipal = 0, somaSecundaria = 0;
		String numerosColunaPrincipal = "", numerosColunaSecundaria = "";
		
		Scanner input = new Scanner(System.in);
			
		System.out.println("------------------------------------------");
		System.out.println("          Formação de Matriz 3x3          ");
		System.out.println("------------------------------------------");
		
		for (int x = 0; x < 3; x++) {
			
			for(int y = 0; y < 3; y++) {
			
			System.out.println("Insira o valor da posição [" + x + "][" + y + "]: ");
			matriz[x][y] = input.nextInt();
				
				if (x == y) {
					
					numerosColunaPrincipal += ( matriz[x][y] +" ");
					somaPrincipal += matriz[x][y];
				}
				if ((x + y) == 2) {
					
					numerosColunaSecundaria += ( matriz[x][y] +" ");
					somaSecundaria += matriz[x][y];
				}
			}
		} 
		
		System.out.println("------------------------------------------------------------");
		System.out.println("Elementos da Diagonal Principal: " +   numerosColunaPrincipal);
		System.out.println("Elementos da Diagonal Secundária: " + numerosColunaSecundaria);
		System.out.println("Soma dos Elementos da Diagonal Principal: " +   somaPrincipal);
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaSecundaria);
	}
}
