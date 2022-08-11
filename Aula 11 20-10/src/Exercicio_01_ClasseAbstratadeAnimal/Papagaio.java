package Exercicio_01_ClasseAbstratadeAnimal;

public class Papagaio extends Ave implements AnimalDomestico{
	
	Papagaio(){
	}


	public void voar() {
		System.out.println("Estou voando...");
	}


	public void emitirSom() {
		System.out.println("Crrác crrác !");
	}


	@Override
	public void levarVeterinario() {
		System.out.println("Indo ao veterinário...");
		
	}


	@Override
	public void alimentar() {
		System.out.println("Comendo minha alpiste...");
		
	}

}
