/*Fa�a um programa que receba tr�s notas e seus respectivos pesos, 
 * calcule e mostre a m�dia ponderada.*/

import java.util.Scanner;

public class lista01_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float a, b, c, media;
		
		System.out.print("1� Nota: ");
		a = scan.nextFloat();
		System.out.print("2� n�mero: ");
		b = scan.nextFloat();
		System.out.print("3� n�mero: ");
		c = scan.nextFloat();
		
		media = ((a * 1) + (b * 2) + (c * 3))/6;
		
		System.out.printf("M�dia ponderada= %.2f", media);
	}

}

/*Corre��o

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
		System.out.println("M�dia: "+ ((n1+n2+n3)/3) );		
		System.out.printf("%s%2.1f", "M�dia: " , ((n1+n2+n3)/3));		
	}

}
*/