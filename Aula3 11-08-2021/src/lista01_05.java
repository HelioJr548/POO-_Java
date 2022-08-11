/*Fa�a um programa que receba o sal�rio de um funcion�rio e 
 * o percentual de aumento, calcule e mostre o valor do aumento e 
 * o novo sal�rio.*/

import java.util.Scanner;

public class lista01_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Float sal, nsal, aumento, perc;
		
		System.out.print("Informe o sal�rio atual do funcion�rio: R$ ");
		sal  = scan.nextFloat();
		System.out.print("Informe o percentual do aumento: ");
		perc = scan.nextFloat();
		
		aumento = sal * perc/100;
		System.out.printf("Valor do aumento: R$ %.3f", aumento);
		System.out.println();
		
		nsal = (sal * perc/100)+ sal;
		System.out.printf("Novo sal�rio do funcionario: R$ %.3f", nsal);
	}

}

/* Corre��o
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		float salario, percentual;
		Scanner meuScanner = new Scanner(System.in);  // Cria um objeto Scanner	

		System.out.print("Sal�rio: ");
		salario = meuScanner.nextFloat();
		
		System.out.print("Percentual: ");
		percentual = meuScanner.nextFloat();
		
		System.out.printf("%s%5.2f%s%.2f", "Sal�rio + ", percentual , "% = ", 
				salario+(salario * percentual / 100 ) );	
	
	}
}
*/