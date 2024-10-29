package LacoDeRepeticao;
import java.util.Scanner;

// Enunciado:
// Para doar sangue é necessário ter entre 18 e 69 anos de idade. Pessoas com idade entre 60 e 69 anos, só podem doar se não for a sua primeira 
// doação. Escreva um Algoritmo em Java que obtenha via teclado o nome do doador (String), a idade (inteiro) do doador e se é a primeira doação 
// (boolean). De acordo com as Regras para a doação, mostre na tela se o doador está Apto ou Não Apto para doar sangue.


public class Exercicio03If {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Verificador para possíveis registro de pessoas doadoras de sangue.");
		
		System.out.println("Nome da pessoa doadora: ");
		String nomeDoador = leia.next();
		
		System.out.println("Idade: ");
		int idadeDoador = leia.nextInt();
		
		System.out.println("Seria sua primeira doação? ");
		System.out.println("TRUE para Sim ou FALSE para Não");
		boolean verifDoa = leia.nextBoolean();
		
		leia.close();
		
		if (idadeDoador >= 18 && idadeDoador <= 69) {
			if ((idadeDoador >= 60 && idadeDoador <= 69) && verifDoa == true) {
				
				System.out.println(nomeDoador + " não está apto(a) para doar sangue!");
				return;
			}
			
			System.out.println(nomeDoador + " está apto(a) para doar sangue!");
			
		}
		else {
			System.out.println(nomeDoador + " não está apto(a) para doar sangue!");
		}
		
	}

}
