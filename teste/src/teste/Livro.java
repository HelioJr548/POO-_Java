package teste;

public class Livro {
	private int livro;
	private String titulo;
	
	

	public Livro(int livro, String titulo) {
		this.livro = livro;
		this.titulo = titulo;
	}



	@Override
	public String toString() {
		return "Livro: " + Integer.toString(this.livro) + " - Titulo: " +titulo;
	}

	public static void main(String[] args) {
		Livro livro = new Livro(1,"Teste livro");
		System.out.printf(livro.toString());

	}

}
