/* Desenvolva um algoritmo em Java para uma conta bancária. O programa deverá ler o tipo de operação a ser realizada com base na tabela abaixo 
 * (número inteiro entre 1 e 3) e o valor a ser depositado ou sacado (somente nas opções 2 e 3). Considere que um saque só pode ser realizado 
 * caso haja saldo suficiente. Ao final de cada operação, exiba o novo Saldo na tela. A variável saldo (float), será inicializada com o 
 * valor de R$ 1000.00. Caso a operação seja diferente do intervalo 1 a 3, mostre a mensagem Operação Inválida! */

package LacosCondicionais;
import java.util.Scanner;

public class Exercicio08Switch {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		float saldo = 1000.00f;
		int codigoOperacao;
		float valor;
		
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("=                Selecione o código da operação desejada para sua conta               =");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("=      Cod. Operação                 Nome da Operação                                 =");
		System.out.println("=          1                          Saldo                                           =");
		System.out.println("=          2                          Saque                                           =");
		System.out.println("=          3                          Depósito                                        =");
		System.out.println("---------------------------------------------------------------------------------------");

		System.out.print("Digite o código da operação (1 a 3): ");
		codigoOperacao = input.nextInt();

		switch (codigoOperacao) {
		
		    case 1:
		        System.out.printf("Seu saldo atual é: R$ %.2f\n", saldo);
		        break;
		        
		    case 2:
		        System.out.print("Digite o valor a ser sacado: ");
		        valor = input.nextFloat();
		        
		        if (valor > saldo) {
		        	
		            System.out.println("Saldo insuficiente para realizar o saque.");
		        } 
		        else {
		        	
		            saldo -= valor;
		            System.out.printf("Saque realizado com sucesso. Novo saldo: R$ %.2f\n", saldo);
		        }
		        break;
		        
		    case 3:
		        System.out.print("Digite o valor a ser depositado: ");
		        valor = input.nextFloat();
		        
		        saldo += valor;
		        
		        System.out.printf("Depósito realizado com sucesso. Novo saldo: R$ %.2f\n", saldo);
		        break;
		        
		    default:
		        System.out.println("Operação inválida!");
		}

		input.close();

	}

}
