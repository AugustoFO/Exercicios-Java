/* Enunciado:
 * Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela se a soma de A + B é maior, menor ou igual a C.*/


package LacosCondicionais;
import java.util.Scanner;

public class Exercicio01If { 
	 public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
		 
		System.out.println("Insira o primeiro valor inteiro: ");
		int numeroA = input.nextInt();
		
		System.out.println("Insira o segundo valor inteiro: ");
		int numeroB = input.nextInt();
		
		System.out.println("Insira o terceiro valor inteiro: ");
		int numeroC = input.nextInt();
		
		input.close();
		
		int somaAB = numeroA + numeroB;
		String resultadoDaSoma;
		
		if (somaAB > numeroC) {
			
			resultadoDaSoma = " é Maior do que " + numeroC;
		} 
		
		else if (somaAB < numeroC) {
			
			resultadoDaSoma = " é Menor do que " + numeroC;
		}
		
		else {
			
			resultadoDaSoma = " é Igual a " + numeroC;
		}
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println(numeroA + " + " + numeroB + " = " + somaAB + " > " + numeroC);
		System.out.println("A Soma de " + numeroA + " + " + numeroB + resultadoDaSoma);
	}
}
