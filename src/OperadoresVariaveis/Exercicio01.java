package OperadoresVariaveis;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
	
		System.out.print("Digite o Salário: ");
		float salario = leia.nextFloat();
	
		System.out.print("Digite o Abono: ");
		float abono = leia.nextFloat();
	
		float novoSalario = (salario + abono);
	
		System.out.println("Novo salário:" + novoSalario);
	
		leia.close();
	}
}
