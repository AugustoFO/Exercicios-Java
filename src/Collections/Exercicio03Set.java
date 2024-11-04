/*Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer. O programa deverá solicitar ao usuário, 
 * que ele digite via teclado 10 valores inteiros não repetidos e adicione-os individualmente na Collection Set. Em seguida, faça o que se pede:
 * Mostre na tela todos os elementos da Collection Set, utilizando a Classe Iterator. */

package Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;

@SuppressWarnings("resource")

public class Exercicio03Set {
	public static void main(String[] args) {
		
		Set<Integer> setNumeros = new HashSet<Integer>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("-------------------------------------------------");
		System.out.println("   Insira 10 números para a ordenação crescente  ");
		System.out.println("-------------------------------------------------");
		
		for(byte i = 1; i < 11; i++) {
			System.out.println("Digite o " + i + "° numero: ");
			setNumeros.add(input.nextInt());
		}
		
		TreeSet<Integer> numerosOrdenados = new TreeSet<>(setNumeros);
		Iterator<Integer> iNumeros = numerosOrdenados.iterator();
		
		System.out.println("-------------------------------------------------");
		System.out.println("                 Números ordenados               ");
		System.out.println("-------------------------------------------------");
		
		while(iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}
	}
}
