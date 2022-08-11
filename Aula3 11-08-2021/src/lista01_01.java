/*Faça um programa que receba quatro números inteiros, 
 * calcule e mostre a soma desses números.*/

import java.util.Scanner;

public class lista01_01 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print("1° número: ");
		int a = n.nextInt();
		System.out.print("2° número: ");
		int b = n.nextInt();
		System.out.print("3° número: ");
		int c = n.nextInt();
		System.out.print("4° número: ");
		int d = n.nextInt();
		System.out.print("Soma dos números= "+(a + b + c + d));
	}

}

/* Correção do prof

import java.util.Scanner;  // Importando a Classe Scanner

public class Main {
	public static void main(String[] args) {
		int n1, n2, n3, n4;
		Scanner meuScanner = new Scanner(System.in);  // Cria um objeto Scanner
		System.out.print("1o. Número: ");
		n1 = meuScanner.nextInt();
		System.out.print("2o. Número: ");
		n2 = meuScanner.nextInt();
		System.out.print("3o. Número: ");
		n3 = meuScanner.nextInt();
		System.out.print("4o. Número: ");
		n4 = meuScanner.nextInt();
		System.out.println("Soma: "+ (n1+n2+n3+n4));
	}
}
*/