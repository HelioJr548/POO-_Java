/*Fa�a um programa que receba quatro n�meros inteiros, 
 * calcule e mostre a soma desses n�meros.*/

import java.util.Scanner;

public class lista01_01 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print("1� n�mero: ");
		int a = n.nextInt();
		System.out.print("2� n�mero: ");
		int b = n.nextInt();
		System.out.print("3� n�mero: ");
		int c = n.nextInt();
		System.out.print("4� n�mero: ");
		int d = n.nextInt();
		System.out.print("Soma dos n�meros= "+(a + b + c + d));
	}

}

/* Corre��o do prof

import java.util.Scanner;  // Importando a Classe Scanner

public class Main {
	public static void main(String[] args) {
		int n1, n2, n3, n4;
		Scanner meuScanner = new Scanner(System.in);  // Cria um objeto Scanner
		System.out.print("1o. N�mero: ");
		n1 = meuScanner.nextInt();
		System.out.print("2o. N�mero: ");
		n2 = meuScanner.nextInt();
		System.out.print("3o. N�mero: ");
		n3 = meuScanner.nextInt();
		System.out.print("4o. N�mero: ");
		n4 = meuScanner.nextInt();
		System.out.println("Soma: "+ (n1+n2+n3+n4));
	}
}
*/