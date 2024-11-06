/*Escreva um programa contendo uma Collection Queue (Fila) de Objetos do tipo string, para organizar uma fila por ordem de chegada dos Clientes 
 * de um Banco. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
 * 1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
 * 2: Listar todos os Clientes na fila
 * 3: Chamar (retirar) uma pessoa da fila 
 * 0: O programa deve ser finalizado. 
 * Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila.*/

package Collections;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class ExercicioFila {
    public static void main(String[] args) {
        
        Queue<String> filaClientes = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        byte opcao;
        int posicao;

        System.out.println();
        System.out.println("               Gerenciador de Fila               ");
        
        do {
            System.out.println("*************************************************");
            System.out.println("                                                 ");
            System.out.println("         1 - Adicionar cliente na fila           ");
            System.out.println("         2 - Listar todos os clientes            ");
            System.out.println("         3 - Retirar clientes da fila            ");
            System.out.println("         0 - Sair                                ");
            System.out.println("                                                 ");
            System.out.println("*************************************************");
            System.out.print("Digite uma opção: ");
            opcao = input.nextByte();
            input.nextLine();
            System.out.println();
            
            switch (opcao) {
                
                case 1:
                    System.out.print("Digite nome e sobrenome do cliente: ");
                    filaClientes.add(input.nextLine());
                    System.out.println("-------------------------------------------------");
                    System.out.println("Cliente Adicionado!");
                    System.out.println("-------------------------------------------------");
                    System.out.println("Clientes na fila:");
                    posicao = 1;
                    for (String cliente : filaClientes) {
                        System.out.println(posicao + " - " + cliente);
                        posicao++;
                    }
                    System.out.println();
                    break;
                    
                case 2:
                    if (filaClientes.isEmpty()) {
                        System.out.println("A fila está vazia.");
                    } 
                    else {
                        System.out.println("Clientes na fila:");
                        posicao = 1;
                        for (String cliente : filaClientes) {
                            System.out.println(posicao + " - " + cliente);
                            posicao++;
                        }
                        System.out.println();
                    }
                    break;
                    
                case 3:
                    String clienteRemovido = filaClientes.poll();
                    if (clienteRemovido != null) {
                        System.out.println("O cliente " + clienteRemovido + " foi removido!");
                        System.out.println("-------------------------------------------------");
                        System.out.println("Fila atual:");
                        posicao = 1;
                        for (String cliente : filaClientes) {
                            System.out.println(posicao + " - " + cliente);
                            posicao++;
                        }
                        System.out.println("-------------------------------------------------");
                    } 
                    else {
                        System.out.println("A fila está vazia. Nenhum cliente para remover.");
                    }
                    break;
                    
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
        
        input.close();
    }
}