/* Enunciado:
* Para doar sangue é necessário ter entre 18 e 69 anos de idade. Pessoas com idade entre 60 e 69 anos, só podem doar se não for a sua primeira 
* doação. Escreva um Algoritmo em Java que obtenha via teclado o nome do doador (String), a idade (inteiro) do doador e se é a primeira doação 
* (boolean). De acordo com as Regras para a doação, mostre na tela se o doador está Apto ou Não Apto para doar sangue.*/

package LacosCondicionais;
import java.util.Scanner;

public class Exercicio03If {
    public static void main(String[] args) {
    	
    	boolean estaApto;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Verificador para possíveis registro de pessoas doadoras de sangue.");
        
        System.out.print("Nome da pessoa doadora: ");
        String nomeDoador = input.next();
        
        System.out.print("Idade: ");
        int idadeDoador = input.nextInt();
        
        System.out.print("Seria sua primeira doação? (true para Sim ou false para Não): ");
        boolean primeiraDoacao = input.nextBoolean();
        
        input.close();
        
        if (idadeDoador >= 18 && idadeDoador <= 69) {
        	
            if (idadeDoador >= 60 && idadeDoador <= 69 && primeiraDoacao) {
            	
                estaApto = false;
            } 
            else {
            	
            	estaApto = true;
            }
        } 
        else {
        	
        	estaApto = false;
        }
        
        if (estaApto == true) {
        	
        	System.out.println(nomeDoador + " está apto(a) para doar sangue!");
        }
        else {
        	
        	System.out.println(nomeDoador + " não está apto(a) para doar sangue!");
        }
    }
}
