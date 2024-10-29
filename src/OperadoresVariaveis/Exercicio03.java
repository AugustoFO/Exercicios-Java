package OperadoresVariaveis;
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu salário Bruto: ");
		float salarioBru = leia.nextFloat();
		
		System.out.println("Digite seu Adicional Noturno: ");
		float adicionalNot = leia.nextFloat();
		
		System.out.println("Digite o valor da sua hora extra: ");
		float horaExtra = leia.nextFloat();
		
		System.out.println("Digite o valor dos seus descontos: ");
		float desconto = leia.nextFloat();
		
		float salarioLiq = salarioBru + adicionalNot + (horaExtra * 5) - desconto;

		
		System.out.println("Seu salário líquido é de: " + salarioLiq);
		
		leia.close();
	}
}
