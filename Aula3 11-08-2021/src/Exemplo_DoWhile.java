
public class Exemplo_DoWhile {

	public static void main(String[] args) {
		int i = 1;
		do {
			if  (i % 2 == 0) { // confere se o i � par
				System.out.printf("i � par = %d\n", i);
			} else {
				System.out.printf("i � impar = %d\n", i);
			}
			i++;
		} while (i < 11);
		
		
	}

}
