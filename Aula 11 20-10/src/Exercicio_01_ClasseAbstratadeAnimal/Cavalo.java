package Exercicio_01_ClasseAbstratadeAnimal;

public class Cavalo extends Mamifero implements AnimalDomestico{
	Cavalo(){
	}

	public void amamentar() {
		System.out.println("Estou amamentando...");
	}

	public void emitirSom() {
		System.out.println("iiirrrr� !");
	}

	@Override
	public void levarVeterinario() {
		System.out.println("Indo ao veterin�rio...");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo minha ra��o...");
		
	}


		
}


