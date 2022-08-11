package Herança_02;

public class Main {

	public static void main(String[] args) {
		Veiculo[] veiculos = new Veiculo[4];
		veiculos[0] = new Veiculo("A1s5de6", 2019);
		veiculos[1] = new Onibus("B545dasdd", 2018, 60);
		veiculos[2] = new Onibus("C1s5de6dwew", 2017, 70);
		veiculos[3] = new Caminhao("Dsfs541s5de6", 2016, 4);
		
		for (Veiculo veic: veiculos) {
			System.out.println(veic);
		}
	}

}
