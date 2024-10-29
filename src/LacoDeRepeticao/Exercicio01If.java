package LacoDeRepeticao;
import java.util.Scanner;

// Enunciado:
// Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela se a soma de A + B é maior, menor ou igual a C.


public class Exercicio01If { 
	 public static void main(String[] args) {
		 
		 Scanner leia = new Scanner(System.in);
		 
		System.out.println("Insira o primeiro valor inteiro: ");
		int numeroA = leia.nextInt();
		
		System.out.println("Insira o segundo valor inteiro: ");
		int numeroB = leia.nextInt();
		
		System.out.println("Insira o terceiro valor inteiro: ");
		int numeroC = leia.nextInt();
		
		leia.close();
		
		int somaAB = (numeroA + numeroB);
		
		if (somaAB > numeroC) {
			
			System.out.println("----------------------------------------------------------------------");
			System.out.println(numeroA + " + " + numeroB + " = " + somaAB + " > " + numeroC);
			System.out.println("A Soma de " + numeroA + " + " + numeroB + " é Maior do que " + numeroC);
		} 
		else if (somaAB < numeroC) {
			
			System.out.println("----------------------------------------------------------------------");
			System.out.println(numeroA + " + " + numeroB + " = " + somaAB + " < " + numeroC);
			System.out.println("A Soma de " + numeroA + " + " + numeroB + " é Menor do que " + numeroC);
		}
		else {
			
			System.out.println("----------------------------------------------------------------------");
			System.out.println(numeroA + " + " + numeroB + " = " + somaAB + " = " + numeroC);
			System.out.println("A Soma de " + numeroA + " + " + numeroB + " é Igual a" + numeroC);
		}
		
		
		leia.close();
	}
}
