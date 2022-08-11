import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		/*
		System.out.println("Hello World!!, Java");
		System.out.print("Mensagem 2\n");
		System.out.print("Mensagem 3");
		*/
		
		//Declarando variaveis no java
		String nome = "José";
		int idade = 10;
		double altura = 1.58;
		float peso = 52.5f;
		
		Scanner meuScanner = new Scanner(System.in);
		System.out.print("Entre com nome: ");
		nome = meuScanner.nextLine();
		
		System.out.print("Entre com a idade: ");
		idade = meuScanner.nextInt();
		
		System.out.print("Entre com a altura: ");
		altura =  meuScanner.nextDouble();
			
		System.out.print("Entre com o peso: ");
		peso = meuScanner.nextFloat();
		
		System.out.println("Nome: " + nome);
		System.out.println("idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Peso: " + peso);
		
		
		
	}

}
