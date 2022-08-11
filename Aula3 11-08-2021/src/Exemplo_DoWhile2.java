import java.util.Scanner;

public class Exemplo_DoWhile2 {

	public static void main(String[] args) {
		int i = 1;
		Scanner meuScanner = new Scanner(System.in);
		do {
			System.out.print("Número: ");
			i = meuScanner.nextInt();
			if  (i % 2 == 0) { // confere se o i é par
				System.out.printf("i é par = %d\n", i);
			} else {
				System.out.printf("i é impar = %d\n", i);
			}
			
		} while (i !=0);
		
		
	}

}
