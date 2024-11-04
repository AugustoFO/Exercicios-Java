/*Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), via teclado e mostre na tela o total de pessoas 
 * cuja idade seja menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve ser finalizada ao 
 * digitar uma idade negativa.*/

package LacosRepeticao;
import java.util.Scanner;

public class Exercicio03While {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int idade = 0, totalIdadeAbaixo = 0, totalIdadeAcima = 0;
		
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println(" Digite a idade das pessoas (digite uma idade negativa para encerrar o programa): ");
		System.out.println("----------------------------------------------------------------------------------");
		
		while (true) {
			System.out.print("Digite uma idade: ");
			idade = input.nextInt();
			
			
			if (idade < 0) {
				
				break; 
			}
			
			if (idade < 21) {
				
				totalIdadeAbaixo++;
			} 
			else if (idade > 50) {
				
				totalIdadeAcima++;
			}
		}
		
		input.close();
		
		System.out.println("Total de pessoas menores de 21 anos: " + totalIdadeAbaixo);
		System.out.println("Total de pessoas maiores de 50 anos: " + totalIdadeAcima);
		
	}

}
