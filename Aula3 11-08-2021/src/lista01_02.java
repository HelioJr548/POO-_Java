/*Fa�a um programa que receba tr�s notas, 
 * calcule e mostre a m�dia aritm�tica entre elas.*/

import java.util.Scanner;

public class lista01_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1� Nota: ");
		float a = scan.nextFloat();
		System.out.print("2� Nota: ");
		float b = scan.nextFloat();
		System.out.print("3� Nota: ");
		float c = scan.nextFloat();
		System.out.print("M�dia= "+((a + b + c)/3));
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