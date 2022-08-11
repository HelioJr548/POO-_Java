
public class Exemplo_DoWhile {

	public static void main(String[] args) {
		int i = 1;
		do {
			if  (i % 2 == 0) { // confere se o i é par
				System.out.printf("i é par = %d\n", i);
			} else {
				System.out.printf("i é impar = %d\n", i);
			}
			i++;
		} while (i < 11);
		
		
	}

}
