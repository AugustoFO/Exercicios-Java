/*Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String. O programa deverá 
 * solicitar ao usuário, que ele digite via teclado 5 cores e deverá adicioná-las individualmente no ArrayList. Em seguida, faça o que se pede:
 * Mostre na tela todas as cores que foram adicionadas. 
 * Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.*/

package Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings("resource")

public class Exercicio01ArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> listaCores = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("-------------------------------------");
		System.out.println("   Insira 5 cores para a ordenação   ");
		System.out.println("-------------------------------------");
		
		for(byte i = 1; i <= 5; i++) {
			 
			String posicao = "";
			
			switch (i) {
			
				case 1:
					posicao = "primeira";
					break;
					
				case 2:
					posicao = "segunda";
					break;
					
				case 3:
					posicao = "terceira";
					break;
					
				case 4:
					posicao = "quarta";
					break;
					
				case 5:
					posicao = "quinta";
					break;
					
			}
			
			System.out.println("Insira a " + posicao + " cor: ");
			listaCores.add(input.next());
		}
		
		Iterator<String> iCores = listaCores.iterator();
		
		System.out.println("------------------------------------");
		System.out.println(" As cinco cores selecionadas foram: ");
		System.out.println("------------------------------------");
		
		while(iCores.hasNext()) {
			System.out.println(iCores.next());
		}
		
		System.out.println("----------------------------------------");
		System.out.println(" As cinco cores ordenadas em crescente: ");
		System.out.println("----------------------------------------");
		
		listaCores.sort(null);
		Iterator<String> iCoresOrdenadas = listaCores.iterator();
		
		while(iCoresOrdenadas.hasNext()) {
			System.out.println(iCoresOrdenadas.next());
		}
	}
}
