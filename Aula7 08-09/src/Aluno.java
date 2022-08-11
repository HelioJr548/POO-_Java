
public class Aluno extends Pessoa {
// Atributos
	private String RA;
	private int nrFaltas;

// Construtor	
	public Aluno() {
	}
	public Aluno(String nome, String identidade, Data dtNascimento,
			String RA, int nrFaltas ) {
		super(nome, identidade, dtNascimento);
		this.RA = RA;
		this.nrFaltas = nrFaltas;
	}
	
// Getters e Setters
	public String getRA() {
		return RA;
	}
	public void setRA(String rA) {
		RA = rA;
	}
	public int getNrFaltas() {
		return nrFaltas;
	}
	public void setNrFaltas(int nrFaltas) {
		this.nrFaltas = nrFaltas;
	}
	@Override
	public String toString() {
		return "Aluno [RA=" + RA + ", nrFaltas=" + nrFaltas + "] - "+ super.toString();
	}
	

	
}
