/*Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe Wrapper Integer, inicializada com 10 valores inteiros. 
 * O programa deverá solicitar ao usuário, que ele digite via teclado 1 número inteiro e caso ele seja encontrado no ArrayList, exiba na tela 
 * a posição deste número na Collection. Caso o número não seja encontrado, ele deverá exibir na tela a mensagem: O número NN não foi encontrado*/

package Collections;
import java.util.Scanner;
import java.util.ArrayList;


public class Exercicio02ArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		listaNumeros.add(2);
		listaNumeros.add(5);
		listaNumeros.add(1);
		listaNumeros.add(3);
		listaNumeros.add(4);
		listaNumeros.add(9);
		listaNumeros.add(7);
		listaNumeros.add(8);
		listaNumeros.add(10);
		listaNumeros.add(6);
		
		Scanner input = new Scanner(System.in);
		int numeroProcurado, posicao;
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numeroProcurado = input.nextInt();
		
		posicao = listaNumeros.indexOf(numeroProcurado);
        
        if (posicao != -1) {
            System.out.println("O número " + numeroProcurado + " está localizado na posição: " + posicao);
        } else {
            System.out.println("O número " + numeroProcurado + " não foi encontrado!");
        }
        
        input.close();
	}
}
