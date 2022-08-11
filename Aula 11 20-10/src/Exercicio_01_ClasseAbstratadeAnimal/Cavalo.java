package Exercicio_01_ClasseAbstratadeAnimal;

public class Cavalo extends Mamifero implements AnimalDomestico{
	Cavalo(){
	}

	public void amamentar() {
		System.out.println("Estou amamentando...");
	}

	public void emitirSom() {
		System.out.println("iiirrrrí !");
	}

	@Override
	public void levarVeterinario() {
		System.out.println("Indo ao veterinário...");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo minha ração...");
		
	}


		
}


