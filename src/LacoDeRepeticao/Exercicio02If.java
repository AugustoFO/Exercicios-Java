package LacoDeRepeticao;
import java.util.Scanner;

//Enunciado:
//Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na tela uma mensagem indicando se este número é par ou ímpar e
//se o número é positivo ou negativo.

public class Exercicio02If {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
         System.out.println("Digite um número inteiro para verificação: ");
         int numero = leia.nextInt();
         
         leia.close();
         
         int resto = numero % 2;
         
         if (numero == 0) {
        	 
             System.out.println("O número é zero, não é nem par nem ímpar.");
         }
         else if (resto == 0) {
        	 if(numero > 0) {
        		 
        		 System.out.println("O Número " + numero + " é par e positivo!");
        	 }
        	 else {
        		 
        		System.out.println("O Número " + numero + " é par e negativo!");
        	 }
         }
         else {
        	 if(numero > 0) {
        		 
        		 System.out.println("O Número " + numero + " é ímpar e positivo!");
        	 }
        	 else {
        		 
        		System.out.println("O Número " + numero + " é ímpar e negativo!");
        	 }
         }
    }
}
