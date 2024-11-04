/*Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer, inicializada com 10 valores inteiros. 
 * O programa deverá solicitar ao usuário, que ele digite via teclado 1 número inteiro e caso ele seja encontrado no Set, exiba na tela a 
 * mensagem: Número 00 Encontrado! Caso o número não seja encontrado, ele deverá exibir na tela a mensagem: O número NN não foi encontrado!*/

package Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Exercicio04Set {
	public static void main(String[] args) {
		
		Set<Integer> setNumeros = new HashSet<Integer>();
		setNumeros.add(2);
		setNumeros.add(5);
		setNumeros.add(1);
		setNumeros.add(3);
		setNumeros.add(4);
		setNumeros.add(9);
		setNumeros.add(7);
		setNumeros.add(8);
		setNumeros.add(10);
		setNumeros.add(6);
		
		Scanner input = new Scanner(System.in);
		int numeroProcurado;
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numeroProcurado = input.nextInt();
		
		if (setNumeros.contains(numeroProcurado)) {
            System.out.println("O número " + numeroProcurado + " foi encontrado!");
        } else {
            System.out.println("O número " + numeroProcurado + " não foi encontrado!");
        }
        
        input.close();
	}
}
