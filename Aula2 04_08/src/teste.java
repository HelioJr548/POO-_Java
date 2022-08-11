import java.util.Scanner;

public class teste {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Float sal, nsal; 
		
		System.out.print("Informe o salário base do funcionário: R$ ");
		sal  = scan.nextFloat();
		
		nsal = sal - (sal * 2/100);
		System.out.printf("Salário a receber: R$ %.2f", nsal);
	}

}
