/*Escreva um programa contendo uma Collection Stack (Pilha) de Objetos string, para organizar a retirada de livros de uma pilha. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
 * 1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
 * 2: Listar todos os livros da Pilha
 * 3: Retirar um livro da pilha 
 * 0: O programa deve ser finalizado. 
 * Caso a pilha esteja vazia, ao tentar retirar um livro da pilha, o programa deverá informar que a pilha está vazia.*/

package Collections;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {
    public static void main(String[] args) {
        
        Stack<String> pilhaLivros = new Stack<>();
        Scanner input = new Scanner(System.in);
        byte opcao;

        System.out.println();
        System.out.println("               Gerenciador de Pilha de Livros               ");
        
        do {
            System.out.println("************************************************************");
            System.out.println("                                                            ");
            System.out.println("         1 - Adicionar um novo livro na pilha               ");
            System.out.println("         2 - Listar todos os livros da pilha                ");
            System.out.println("         3 - Retirar um livro da pilha                      ");
            System.out.println("         0 - Sair                                           ");
            System.out.println("                                                            ");
            System.out.println("************************************************************");
            System.out.print("Digite uma opção: ");
            opcao = input.nextByte();
            input.nextLine();
            System.out.println();
            
            switch (opcao) {
                
                case 1:
                    System.out.print("Digite o nome do livro: ");
                    pilhaLivros.push(input.nextLine());
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Livro Adicionado à Pilha!");
                    System.out.println("----------------------------------------------------------");
                    break;
                    
                case 2:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A pilha de livros está vazia.");
                    } 
                    else {
                        System.out.println("Livros na pilha (do topo para o final):");
                        
                        for (int i = pilhaLivros.size() - 1; i >= 0; i--) {
                            System.out.println((i + 1) + " - " + pilhaLivros.get(i));
                        }
                        System.out.println();
                    }
                    break;
                    
                case 3:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A pilha de livros está vazia. Nenhum livro para retirar.");
                    } 
                    else {
                        String livroRemovido = pilhaLivros.pop();
                        System.out.println("O livro \"" + livroRemovido + "\" foi retirado da pilha!");
                        System.out.println("----------------------------------------------------------");
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

