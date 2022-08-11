import java.util.Scanner;
public class CarroSaida {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		
		System.out.print("Informe a marca do seu carro: ");
		carro1.marca = scan.next();
		
		System.out.print("Informe o modelo do seu carro: ");
		carro1.modelo = scan.next();
		
		System.out.print("Informe a cor do seu carro: ");
		carro1.cor = scan.next();
		
		System.out.print("Informe a data de fabricação do seu carro: ");
		carro1.ano = scan.nextInt();
		System.out.print("\n____ CARRO 1 ____");
		carro1.imprimir();
		
		System.out.print("Informe a marca do seu carro: ");
		carro1.marca = scan.next();
		
		System.out.print("Informe o modelo do seu carro: ");
		carro2.modelo = scan.next();
		
		System.out.print("Informe a cor do seu carro: ");
		carro2.cor = scan.next();
		
		System.out.print("Informe a data de fabricação do seu carro: ");
		carro2.ano = scan.nextInt();
		System.out.print("\n____ CARRO 2 ____");
		carro2.imprimir();
		
	}

}
