package LacoDeRepeticao;
import java.util.Scanner;

public class Exercicio07Switch {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float numero1, numero2, resultado;
		int codigoOperacao;
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("=                            Tabela de operação matemática                    =");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("=      Cod. Operação               Nome da Operação                           =");
		System.out.println("=          1                        Soma                                      =");
		System.out.println("=          2                        Subtração                                 =");
		System.out.println("=          3                        Multiplicação                             =");
		System.out.println("=          4                        Divisão                                   =");
		System.out.println("-------------------------------------------------------------------------------");

		System.out.print("Digite o primeiro número: ");
		numero1 = input.nextFloat();
		System.out.print("Digite o segundo número: ");
		numero2 = input.nextFloat();
		System.out.print("Digite o código da operação (1 a 4): ");
		codigoOperacao = input.nextInt();
		
		input.close();

		switch (codigoOperacao) {
		
		    case 1:
		        resultado = numero1 + numero2;
		        System.out.println("Resultado da Soma: " + resultado);
		        break;
		        
		    case 2:
		        resultado = numero1 - numero2;
		        System.out.println("Resultado da Subtração: " + resultado);
		        break;
		        
		    case 3:
		        resultado = numero1 * numero2;
		        System.out.println("Resultado da Multiplicação: " + resultado);
		        break;
		        
		    case 4:
		        if (numero2 != 0) {
		        	
		            resultado = numero1 / numero2;
		            System.out.println("Resultado da Divisão: " + resultado);
		        } 
		        else {
		        	
		            System.out.println("Erro: Divisão por zero não é permitida.");
		        }
		        break;
		        
		    default:
		        System.out.println("Operação Inválida!");
		}

	}
}
