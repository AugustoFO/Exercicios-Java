/*Escreva um algoritmo em Java que leia o código de um item (número inteiro de 1 a 6) e a quantidade comprada deste 
 * item (número inteiro). A seguir, mostre na tela o valor total da conta e o nome do produto que foi comprado.*/

package LacosCondicionais;
import java.util.Scanner;

public class Exercicio05Switch {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int codProduto, qtdProduto;
        float valor;
        String nomeProduto;
        
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("= Selecione o código do produto e a quantidade comprada para calcular o valor final =  ");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("=      Cod. Produto               Nome do Produto                 Preço unitário      =");
        System.out.println("=          1                      Cachorro Quente                   R$ 10,00          =");
        System.out.println("=          2                      X-Salada                           R$ 15,00          =");
        System.out.println("=          3                      X-Bacon                            R$ 18,00          =");
        System.out.println("=          4                      Bauru                              R$ 12,00          =");
        System.out.println("=          5                      Refrigerante                       R$ 8,00           =");
        System.out.println("=          6                      Suco de Laranja                    R$ 13,00          =");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.print("= Código: ");
        codProduto = input.nextInt();
        System.out.print("= Quantidade: ");
        qtdProduto = input.nextInt();
        
        input.close();
        
        switch (codProduto) {
        
            case 1:
                nomeProduto = "Cachorro Quente";
                valor = qtdProduto * 10.00f; // por padrão o Java relaciona dados de tipo flutuante como Double, por isso é necessário colocar o f ap final para converter
                break;
                
            case 2:
                nomeProduto = "X-Salada";
                valor = qtdProduto * 15.00f;
                break;
                
            case 3:
                nomeProduto = "X-Bacon";
                valor = qtdProduto * 18.00f;
                break;
                
            case 4:
                nomeProduto = "Bauru";
                valor = qtdProduto * 12.00f;
                break;
                
            case 5:
                nomeProduto = "Refrigerante";
                valor = qtdProduto * 8.00f;
                break;
                
            case 6:
                nomeProduto = "Suco de Laranja";
                valor = qtdProduto * 13.00f;
                break;
                
            default:
                System.out.println("Código de produto inválido!");
                input.close();
                return; 
        }
        
        System.out.printf("O produto %s custará R$ %.2f na quantidade especificada (%d unidade(s)).", nomeProduto, valor, qtdProduto);
   
    }
}

