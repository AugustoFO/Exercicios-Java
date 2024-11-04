/*Elabore um algoritmo que leia as notas de uma classe com 10 participantes durante 4 bimestres de um ano. As 4 notas de cada participante 
 * serão armazenadas em uma linha de uma matrizNotas de números reais, logo cada linha da matrizNotas serão as notas de um participante. Em um vetor de 
 * números reais, armazene as médias de cada participante e exiba as médias de cada um na tela.*/

package VetoresMatrizes;
import java.util.Scanner;

@SuppressWarnings("resource") 

public class Exercicio04Matriz{
	public static void main(String[] args) {
		
		float matrizNotas[][] = new float[10][4], vetorMediaNotas[] = new float[10], somaMedia = 0; 
		String vetorNomeAlunos[] = new String[10];
		
		Scanner input = new Scanner(System.in);
		
		for (int x = 0; x < 10; x++) {
			
			System.out.println("Insira o nome e sobrenome do " + (x + 1) + "º aluno: ");
			vetorNomeAlunos[x] = input.next();
			
			for(int y = 0; y < 4; y++) {
			
				System.out.println("Nota do " + (y + 1)+ "º bimestre: ");
				somaMedia  +=  matrizNotas[x][y] = input.nextFloat();
				
				if (y == 3) {
					vetorMediaNotas[x] = (somaMedia/4);
				}
			}
		}
		
		System.out.println("-----------------------------------------------------");
		System.out.println("                  Médias finais                      ");
		System.out.println("-----------------------------------------------------");
		
		for (int x = 0; x < 10; x++) {
			
			System.out.println("                                    ");
			System.out.println("Nome do aluno: " + vetorNomeAlunos[x]);
			System.out.println("Média Final: "   + vetorMediaNotas[x]);
			System.out.println("                                    ");
			
		}
	} 
}

