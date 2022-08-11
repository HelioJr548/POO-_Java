/*Faça um programa que receba o salário de um funcionário e 
 * o percentual de aumento, calcule e mostre o valor do aumento e 
 * o novo salário.*/

import java.util.Scanner;

public class lista01_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Float sal, nsal, aumento, perc;
		
		System.out.print("Informe o salário atual do funcionário: R$ ");
		sal  = scan.nextFloat();
		System.out.print("Informe o percentual do aumento: ");
		perc = scan.nextFloat();
		
		aumento = sal * perc/100;
		System.out.printf("Valor do aumento: R$ %.3f", aumento);
		System.out.println();
		
		nsal = (sal * perc/100)+ sal;
		System.out.printf("Novo salário do funcionario: R$ %.3f", nsal);
	}

}

/* Correção
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		float salario, percentual;
		Scanner meuScanner = new Scanner(System.in);  // Cria um objeto Scanner	

		System.out.print("Salário: ");
		salario = meuScanner.nextFloat();
		
		System.out.print("Percentual: ");
		percentual = meuScanner.nextFloat();
		
		System.out.printf("%s%5.2f%s%.2f", "Salário + ", percentual , "% = ", 
				salario+(salario * percentual / 100 ) );	
	
	}
}
*/