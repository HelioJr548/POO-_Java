/*Faça um programa que receba três notas e seus respectivos pesos, 
 * calcule e mostre a média ponderada.*/

import java.util.Scanner;

public class lista01_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float a, b, c, media;
		
		System.out.print("1° Nota: ");
		a = scan.nextFloat();
		System.out.print("2° número: ");
		b = scan.nextFloat();
		System.out.print("3° número: ");
		c = scan.nextFloat();
		
		media = ((a * 1) + (b * 2) + (c * 3))/6;
		
		System.out.printf("Média ponderada= %.2f", media);
	}

}

/*Correção

import java.util.Scanner;  // Importando a Classe Scanner
public class Main { 

	public static void main(String[] args) {
		float n1, n2, n3 ;
		Scanner meuScanner = new Scanner(System.in);  // Cria um objeto Scanner	
		System.out.print("Nota 1: ");
		n1 = meuScanner.nextFloat();
		System.out.print("Nota 2: ");
		n2 = meuScanner.nextFloat();
		System.out.print("Nota 3: ");
		n3 = meuScanner.nextFloat();
		System.out.println("Média: "+ ((n1+n2+n3)/3) );		
		System.out.printf("%s%2.1f", "Média: " , ((n1+n2+n3)/3));		
	}

}
*/