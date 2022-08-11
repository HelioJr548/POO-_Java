package Exercicio_01_ClasseAbstratadeAnimal;

public class Cachorro extends Mamifero 
implements AnimalEstimacao,AnimalDomestico{
	private int tamanho;
	private String raca;

	public Cachorro() {
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public void amamentar() {
		System.out.println("Estou amamentando...");
	}


	public void emitirSom() {
		System.out.println("Au !!! Au !!! Au !!!");
	}

	public void levarVeterinario() {
		System.out.println("Indo ao veterinário...");
	
	}
	
	public void alimentar() {
		System.out.println("Comendo minha ração...");

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
