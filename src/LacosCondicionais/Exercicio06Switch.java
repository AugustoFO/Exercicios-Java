/*Com base na tabela abaixo, escreva um algoritmo em Java que leia o Nome do Colaborador (String), o Código do Cargo do Colaborador 
 * (número inteiro de 1 a 6) e o Salário (número float). A seguir, mostre na tela o Nome do Colaborador, o Cargo e o novo Salário reajustado.*/

package LacosCondicionais;
import java.util.Scanner;

public class Exercicio06Switch {
	public static void main(String[] args) {
		        
		        Scanner input = new Scanner(System.in);
		        
		        String nomeColaborador, cargo;
		        int codigoCargo;
		        float salario, novoSalario;
		        
		        System.out.println("-----------------------------------------------------------------------------------------");
		        System.out.println("=                    Tabela de referência para calcular o novo salário                  =");
		        System.out.println("-----------------------------------------------------------------------------------------");
		        System.out.println("=      Cod. Cargo                    Nome do Cargo                  Percentual Reajuste =");
		        System.out.println("=          1                          Gerente                          10%              =");
		        System.out.println("=          2                          Vendedor                         7%               =");
		        System.out.println("=          3                          Supervisor                       9%               =");
		        System.out.println("=          4                          Motorista                        6%               =");
		        System.out.println("=          5                          Estoquista                       5%               =");
		        System.out.println("=          6                          Técnico de TI                    8%               =");
		        System.out.println("-----------------------------------------------------------------------------------------");

		        System.out.print("Digite o nome do colaborador: ");
		        nomeColaborador = input.nextLine();
		        System.out.print("Digite o código do cargo (1 a 6): ");
		        codigoCargo = input.nextInt();
		        System.out.print("Digite o salário atual: ");
		        salario = input.nextFloat();

		        input.close();
		        
		        switch (codigoCargo) {
		        
		            case 1:
		                cargo = "Gerente";
		                novoSalario = salario * 1.10f; 
		                break;
		                
		            case 2:
		                cargo = "Vendedor";
		                novoSalario = salario * 1.07f; 
		                break;
		                
		            case 3:
		                cargo = "Supervisor";
		                novoSalario = salario * 1.09f; 
		                break;
		                
		            case 4:
		                cargo = "Motorista";
		                novoSalario = salario * 1.06f; 
		                break;
		                
		            case 5:
		                cargo = "Estoquista";
		                novoSalario = salario * 1.05f; 
		                break;
		                
		            case 6:
		                cargo = "Técnico de TI";
		                novoSalario = salario * 1.08f; 
		                break;
		                
		            default:
		                System.out.println("Código de cargo inválido!");
		                input.close();
		                return; 
		        }

		        System.out.println("---------------------------------------------------------------------------------------");
		        System.out.printf("Nome do Colaborador: %s\n", nomeColaborador);
		        System.out.printf("Cargo: %s\n", cargo);
		        System.out.printf("Novo Salário Reajustado: R$ %.2f\n", novoSalario);
		        System.out.println("---------------------------------------------------------------------------------------");
	}
}
