package Exercicio_01_ClasseAbstratadeAnimal;

public class Gato extends Mamifero implements AnimalDomestico,AnimalEstimacao{
	private String raca;
	
	Gato(){
	}

	public String getRace() {
		return raca;
	}


	public void setRace(String raca) {
		this.raca = raca;
	}


	public void amamentar() {
		System.out.println("Estou amamentando...");
	}

	public void emitirSom() {		
		System.out.println("Miau !");
	}

	public void levarVeterinario() {
		System.out.println("Indo ao veterinário...");
	
	}
	
	public void alimentar() {
		System.out.println("Tomando meu leite...");

	}

	@Override
	public void brincar() {
		System.out.println("Brincando...");
	}

	@Override
	public void levarPassear() {
		System.out.println("Passeando...");
	}
	
	
}
