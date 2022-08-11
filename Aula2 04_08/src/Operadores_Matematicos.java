
public class Operadores_Matematicos {

	public static void main(String[] args) {
		// Variaveis inteiros
		int x=9, y=10, z=15;
		
		// Variavei float
		float k=10.5f, n=12.7f;
		
		System.out.println("x=" +x + ", y="+y + ", z=" +z);
		System.out.println("x * y = " + (x * y) );
		System.out.println("x / y = " + (x / y) );
		System.out.println("x - y = " + (x - y) );
		System.out.println("x + y = " + (x + z) );
		System.out.println("x % y = " + (x % z) );
		
		System.out.println("\nk=" +k + ", n="+n);
		System.out.println("k + n = " + (k + n) );
		System.out.println("k / n = " + (k / n) );
		
		x++; // "x++" é igual a  "x = x + 1"
		y--; // "y++" é igual a  "y = y - 1
		System.out.println("x=" +x + ", y="+y + ", z=" +z);
		
		x += y; // x = x + y;
		System.out.println("\nx=" +x + ", y="+y + ", z=" +z);
		
		x *= y; // x = x * y;
		System.out.println("\nx=" +x + ", y="+y + ", z=" +z + "\n");
		
		System.out.println(5 + 2 / 2); 
		/* mostra resultado inteiro e segue a regra de preferencia de sinais */
		
		System.out.println( (5f + 2) / 2);
		/* resultado decimal e segue a regra de preferencia de parenteses */
		
	}
	
}
