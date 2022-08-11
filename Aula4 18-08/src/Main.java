
public class Main {

	public static void main(String[] args) {	
		//Criando um objeto do tipo Ciculos(classe)
		Circulos circulo1 = new Circulos();
		Circulos circulo2 = new Circulos();
		
		System.out.print("Circulo 1 -> ");
		circulo1.imprimir();//Imprime a primeira forma criado no arquivo Circulos.Java
		
		System.out.print("Circulo 2 -> ");
		circulo2.imprimir();//Imprime a primeira forma criado no arquivo Circulos.Java
		
		circulo1.mover(5f, 7f);
		circulo1.redimensionar(8f);
		System.out.print("\nCirculo 1 -> ");
		circulo1.imprimir();
		
		circulo2.mover(9f,12f);
		circulo2.redimensionar(15.2f);
		System.out.print("Circulo 2 -> ");
		circulo2.imprimir();
		
		System.out.println("Circulo 2 -> raio: " +circulo2.raio);//Observar apenas uma 
		System.out.print("Circulo 2 -> y: " +circulo2.y);
	}

}
