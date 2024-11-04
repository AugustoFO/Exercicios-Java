/* Escreva um algoritmo em Java, que leia 3 palavras (String), que definem as características de um tipo de animal possível segundo o 
 * diagrama abaixo, que deve ser lido da esquerda para a direita.*/

package LacosCondicionais;
import java.util.Scanner;

public class Exercicio04If {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("= Análise e determinação de um animal exemplo com base em características =");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("= Selecione a primeira característica para análise:                       =");
		System.out.println("=                                                                         =");
		System.out.println("=             1 - vertebrados         2 - invertebrados                   =");
		System.out.println("=                                                                         =");
		System.out.println("=            (escreva o número ou o nome correspondente)                  =");
		String caracteristicaA = input.nextLine();
		
		
		if (caracteristicaA.equals("1") || caracteristicaA.equals("vertebrados")) {
			
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("= Selecione a segunda característica para análise:                        =");
			System.out.println("=                                                                         =");
			System.out.println("=             1 - ave                 2 - mamifero                        =");
			System.out.println("=                                                                         =");
			System.out.println("=            (escreva o número ou o nome correspondente)                  =");
			String caracteristicaB = input.nextLine();
			
			if (caracteristicaB.equals("1") || caracteristicaB.equals("ave")) {
				
				System.out.println("---------------------------------------------------------------------------");
				System.out.println("= Selecione a terceira característica para análise:                       =");
				System.out.println("=                                                                         =");
				System.out.println("=               1 - carnivoro             2 - onivoro                     =");
				System.out.println("=                                                                         =");
				System.out.println("=            (escreva o número ou o nome correspondente)                  =");
				String caracteristicaC = input.nextLine();
				System.out.println("----------------------------Analisando....                                 ");
				
				if(caracteristicaC.equals("1") || caracteristicaC.equals("carnivoro")) {
				
					System.out.println("---------------------------------------------------------------------------");
					System.out.println("= O animal com essas características é o: Águia =");
					System.out.println("---------------------------------------------------------------------------");
				}
				else{
					
					System.out.println("---------------------------------------------------------------------------");
					System.out.println("= O animal com essas características é a: POMBA =");
					System.out.println("---------------------------------------------------------------------------");
				}
			}
			else {
				System.out.println("---------------------------------------------------------------------------");
				System.out.println("= Selecione a terceira característica para análise:                       =");
				System.out.println("=                                                                         =");
				System.out.println("=               1 - onivero             2 - herbivoro                     =");
				System.out.println("=                                                                         =");
				System.out.println("=            (escreva o número ou o nome correspondente)                  =");
				String caracteristicaC = input.nextLine();
				System.out.println("----------------------------Analisando....                                 ");
				
				if(caracteristicaC.equals("1") || caracteristicaC.equals("onivoro")) {
					
					System.out.println("---------------------------------------------------------------------------");
					System.out.println("= O animal com essas características é o: HOMEM =");
					System.out.println("---------------------------------------------------------------------------");
				}
				else{
					
					System.out.println("---------------------------------------------------------------------------");
					System.out.println("= O animal com essas características é a: VACA =");
					System.out.println("---------------------------------------------------------------------------");
				}
			}
		}
		
		else if(caracteristicaA.equals("2") || caracteristicaA.equals("invertebrados")){
			
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("= Selecione a segunda característica para análise:                        =");
			System.out.println("=                                                                         =");
			System.out.println("=               1 - inseto              2 - anelideo                      =");
			System.out.println("=                                                                         =");
			System.out.println("=            (escreva o número ou o nome correspondente)                  =");
			String caracteristicaB = input.nextLine();
			
			if (caracteristicaB.equals("1") || caracteristicaB.equals("inseto")) {
				
				System.out.println("---------------------------------------------------------------------------");
				System.out.println("= Selecione a terceira característica para análise:                       =");
				System.out.println("=                                                                         =");
				System.out.println("=               1 - hematofago             2 - herbivoro                  =");
				System.out.println("=                                                                         =");
				System.out.println("=            (escreva o número ou o nome correspondente)                  =");
				String caracteristicaC = input.nextLine();
				System.out.println("----------------------------Analisando....                                 ");
				
				if(caracteristicaC.equals("1") || caracteristicaC.equals("hematofago")) {
				
					System.out.println("---------------------------------------------------------------------------");
					System.out.println("= O animal com essas características é a: PULGA =");
					System.out.println("---------------------------------------------------------------------------");
				}
				else{
					
					System.out.println("---------------------------------------------------------------------------");
					System.out.println("= O animal com essas características é a: LAGARTA =");
					System.out.println("---------------------------------------------------------------------------");
				}
			}
			else {
				System.out.println("---------------------------------------------------------------------------");
				System.out.println("= Selecione a terceira característica para análise:                       =");
				System.out.println("=                                                                         =");
				System.out.println("=               1 - hematofago             2 - onivoro                    =");
				System.out.println("=                                                                         =");
				System.out.println("=            (escreva o número ou o nome correspondente)                  =");
				String caracteristicaC = input.nextLine();
				System.out.println("----------------------------Analisando....                                 ");
				
				if(caracteristicaC.equals("1") || caracteristicaC.equals("hematofago")) {
					
					System.out.println("---------------------------------------------------------------------------");
					System.out.println("= O animal com essas características é a: SANGUESSUGA =");
					System.out.println("---------------------------------------------------------------------------");
				}
				else{
					
					System.out.println("---------------------------------------------------------------------------");
					System.out.println("= O animal com essas características é a: MINHOCA =");
					System.out.println("---------------------------------------------------------------------------");
				}
			}
				
		}
		
		else {
			
			System.out.println("=                        Opção inválida!!!                                =");
			System.out.println("=             1 - vertebrados         2 - invertebrados                   =");
			System.out.println("=                                                                         =");
			System.out.println("= Reinicie o programa e tente novamente!!!!                               =");
		}
	input.close();
	}
}
