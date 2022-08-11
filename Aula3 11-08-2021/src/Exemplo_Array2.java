import java.util.Random;

public class Exemplo_Array2 {

	public static void main(String[] args) {
		String [][] tabuleiro = {
				{".",".","."},
				{".","X","."},
				{".","O","."},
		};
		System.out.print(tabuleiro[0][0]);
		System.out.print(tabuleiro[0][1]);
		System.out.print(tabuleiro[2][1]);
		System.out.print(tabuleiro[2][2]);
		
		System.out.println("\nTabuleiro");
		for(int linha = 0; linha < tabuleiro.length; linha++) {
			for(int coluna=0; coluna < tabuleiro[0].length; coluna++) {
				System.out.println(tabuleiro[linha][coluna]);
		}
	
	}
		System.out.println("\nTabuleiro");
		for(int linha = 0; linha < tabuleiro.length; linha++) {
			for(int coluna=0; coluna < tabuleiro[0].length; coluna++) {
				System.out.print(tabuleiro[linha][coluna]);
			}
			System.out.println();
		}
	}
}
