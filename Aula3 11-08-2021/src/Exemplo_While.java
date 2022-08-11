
public class Exemplo_While {

	public static void main(String[] args) {
		int i = 1;
		while (i < 11) {
			if  (i % 2 == 0) { // confere se o i é par
				System.out.printf("i é par = %d\n", i);
			} else {
				System.out.printf("i é impar = %d\n", i);
			}
			i++;
		}

	}

}
