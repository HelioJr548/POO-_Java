package Exemplos_Modificador_Static;

public class FuncoesMatematicas{
	public static int exponencial(int x, int y) {
		if (y == 0)
			return 1;
		return x * exponencial(x,y -1);
	}
	public static int fatorial(int x) {
		if (x == 0)
			return 1;
		return x * fatorial(x - 1);
	}
	public static int soma(int x, int y) {
		return x + y;
	}
	public static int subtracao(int x, int y) {
		return x - y;
	}
}