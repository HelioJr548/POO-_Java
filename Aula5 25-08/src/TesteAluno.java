
public class TesteAluno {

	public static void main(String[] args) {
		Aluno aluno01 = new Aluno("Ana","00918-07", 8, 10, 0);
		//getClass().getName() + "@" , Integer.toHexString(hashCode())
		System.out.println(aluno01);
		System.out.println("M�dia : " +aluno01.calcularMedia());
		System.out.println("M�dia Final: " +aluno01.calcularMediaFinal());
		
		
		System.out.println();
		
		Aluno aluno02 = new Aluno("Pedro", "123456-09", 7, 8, 0);
		System.out.println(aluno02.toString());
		System.out.println("M�dia : " +aluno02.calcularMedia());
		System.out.println("M�dia Final: " +aluno02.calcularMediaFinal());
		
		System.out.println();
		
		Aluno aluno03 = new Aluno("Alex", "123654", 6, 5,5);
		System.out.println(aluno03); //aluno03.toString()
		System.out.println("M�dia : " +aluno03.calcularMedia());
		System.out.println("M�dia Final: " +aluno03.calcularMediaFinal());
		System.out.println(aluno03.getAprovado());
		aluno03.setNotaReavaliacao(7.5);
		System.out.println();
		System.out.println(aluno03);
	}

}
