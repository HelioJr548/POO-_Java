public class Operacao{
	public static void main(String[] args) {
		System.out.println("ola");
	}
}

abstract class VideoGame{
	private int id;
	private String marca;
	private String nome;
	private String cor;
	
	public VideoGame(int id, String marca, String nome, String cor) {
		this.id = id;
		this.marca = marca;
		this.nome = nome;
		this.cor = cor;
	}
	
	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public String toString() {
		return "VideoGame [id=" + id + ", marca=" + marca + ", nome=" + nome + ", cor=" + cor + "]";
	}
	
}