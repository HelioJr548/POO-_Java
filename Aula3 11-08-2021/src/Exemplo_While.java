
public class Exemplo_While {

	public static void main(String[] args) {
		int i = 1;
		while (i < 11) {
			if  (i % 2 == 0) { // confere se o i � par
				System.out.printf("i � par = %d\n", i);
			} else {
				System.out.printf("i � impar = %d\n", i);
			}
			i++;
		}

	}

}
