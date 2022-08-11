package Heran�a_02;

public class Onibus extends Veiculo {
	private int assentos;
	
	public Onibus(String placa, int ano, int assentos) {
		super(placa, ano);
		this.assentos = assentos;
	}
	
	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int Assentos) {
		this.assentos = Assentos;
	}

	@Override
	public String toString() {
		return "Onibus [eixos=" + assentos + "] - "+super.toString();
	}
	

}
