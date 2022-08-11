/*Fa�a um programa que receba o sal�rio de um funcion�rio,
 *  calcule e mostre o novo sal�rio, 
 *  sabendo-se que este sofreu um aumento de 25%.*/

import java.util.Scanner;

public class lista01_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Float sal, nsal; 
		Double aumento;
		
		aumento = 0.25;
		
		System.out.print("Informe o sal�rio atual do funcion�rio: R$ ");
		sal  = scan.nextFloat();
		
		System.out.println("Sal�rio sofreu aumento de 25%.");
		
		nsal = (float) ((sal * aumento)+ sal);
		System.out.printf("Novo sal�rio do funcionario: R$ %.2f",nsal);
	}

}

/* Corre��o

import java.util.Scanner;  // Importando a Classe Scanner
public class Main {

	public static void main(String[] args) {
		float salario;
		Scanner meuScanner = new Scanner(System.in);  // Cria um objeto Scanner	

		System.out.print("Sal�rio: ");
		salario = meuScanner.nextFloat();
		
		System.out.printf("%s%5.2f", "Sal�rio + 25%: " , 
				(salario * 1.25f ) );	

	}

}
*/