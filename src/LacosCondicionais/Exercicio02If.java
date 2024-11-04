/* Enunciado:
 * Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na tela uma mensagem indicando se este número é par ou ímpar e
 * se o número é positivo ou negativo.*/

package LacosCondicionais;
import java.util.Scanner;

public class Exercicio02If {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
         System.out.println("Digite um número inteiro para verificação: ");
         int numero = input.nextInt();
         
         input.close();
         
         String paridade, sinal;
         
         
         if (numero == 0) {
        	 
             System.out.println("O número é zero, não é nem par nem ímpar.");
             return;
         }
         
         else if (numero % 2 == 0) {
        	 
        	 paridade = "par";
        	 
        	 if(numero > 0) {
        		 
        		 sinal = "positivo";
        	 }
        	 else {
        		 
        		 sinal = "negativo";
        	 }
         }
         
         else {
        	 
        	 paridade = "ímparr";
        	 
        	 if(numero > 0) {
        		 
          		sinal = "positivo";
        	 }
        	 else {
        		
          		sinal = "negativo";
        	 }
         }
         
         System.out.println("O Número " + numero + " é " + paridade + " e " + sinal + "!");
    }
}
