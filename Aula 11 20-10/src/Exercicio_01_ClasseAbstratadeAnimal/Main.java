package Exercicio_01_ClasseAbstratadeAnimal;

public class Main {
	public static void main(String[] args) {
		//AnimaL animal 01 = new Animal(); //NÃO PODE SER INSTANCIADO É UMA CLASSE ABSTRATA
		System.out.println("Ações do Gato:");
		Gato bichano = new Gato();
		bichano.amamentar();
		bichano.emitirSom();
		bichano.alimentar();
		bichano.brincar();
		bichano.levarPassear();
		bichano.levarVeterinario();
		System.out.println();
		
		System.out.println("Ações do cachorro:");
		Cachorro ViraLata = new Cachorro();
		ViraLata.amamentar();
		ViraLata.emitirSom();
		ViraLata.alimentar();
		ViraLata.brincar();
		ViraLata.levarPassear();
		ViraLata.levarVeterinario();
		System.out.println();
		
		System.out.println("Ações do Papagaio:");
		Papagaio LouroJose = new Papagaio();
		LouroJose.voar();
		LouroJose.emitirSom();
		LouroJose.alimentar();
		LouroJose.levarVeterinario();
		System.out.println();
		
		System.out.println("Ações do Cavalo: ");
		Cavalo Silver = new Cavalo();
		Silver.amamentar();
		Silver.emitirSom();
		Silver.alimentar();
		Silver.levarVeterinario();
	}
}
