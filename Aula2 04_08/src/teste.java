import java.util.Scanner;

public class teste {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Float sal, nsal; 
		
		System.out.print("Informe o sal�rio base do funcion�rio: R$ ");
		sal  = scan.nextFloat();
		
		nsal = sal - (sal * 2/100);
		System.out.printf("Sal�rio a receber: R$ %.2f", nsal);
	}

}
