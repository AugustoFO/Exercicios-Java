
package LacosRepeticao;
import java.util.Scanner;

public class Exercicio05DoWhile {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
        
        int numero;
        int somaPositivos = 0;
        
        System.out.println("-------------------------------------------------------------");
		System.out.println("= Soma de números positivos (utilize o zero para finalizar) =");
		System.out.println("-------------------------------------------------------------");

        do {
            System.out.print("Digite um número: ");
            numero = input.nextInt();
            
            if (numero > 0) {
                somaPositivos += numero; 
            }
        } 
        while (numero != 0); 

        System.out.println("A soma dos números positivos é: " + somaPositivos);
        
        input.close();
	}
}
