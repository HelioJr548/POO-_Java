package Exercicio_01_ClasseAbstratadeAnimal;

public class Main {
	public static void main(String[] args) {
		//AnimaL animal 01 = new Animal(); //N�O PODE SER INSTANCIADO � UMA CLASSE ABSTRATA
		System.out.println("A��es do Gato:");
		Gato bichano = new Gato();
		bichano.amamentar();
		bichano.emitirSom();
		bichano.alimentar();
		bichano.brincar();
		bichano.levarPassear();
		bichano.levarVeterinario();
		System.out.println();
		
		System.out.println("A��es do cachorro:");
		Cachorro ViraLata = new Cachorro();
		ViraLata.amamentar();
		ViraLata.emitirSom();
		ViraLata.alimentar();
		ViraLata.brincar();
		ViraLata.levarPassear();
		ViraLata.levarVeterinario();
		System.out.println();
		
		System.out.println("A��es do Papagaio:");
		Papagaio LouroJose = new Papagaio();
		LouroJose.voar();
		LouroJose.emitirSom();
		LouroJose.alimentar();
		LouroJose.levarVeterinario();
		System.out.println();
		
		System.out.println("A��es do Cavalo: ");
		Cavalo Silver = new Cavalo();
		Silver.amamentar();
		Silver.emitirSom();
		Silver.alimentar();
		Silver.levarVeterinario();
	}
}
