
public class Main {

	public static void main(String[] args) {
		Data d1 = new Data();
		Data d2 = new Data(8,9,2021);
		System.out.println(d1);
		System.out.println(d2);
		
		Pessoa p1 = new Pessoa("Pedro","2109876-09", new Data(23,10,1987));
		System.out.println(p1);
		
		Professor prof1 = new Professor("Ana","2109876-20", new Data(4,6,1991),"1010-10");
		System.out.println(prof1);
		
		Aluno a1 = new Aluno("Helio","545576-20", new Data(4,6,1992),"292302265", 0);
		System.out.println(a1);
		
		Funcionario f1 = new Funcionario("Dani","4645576-20", new Data(4,6,1993),new Data(28,2,2018), 5542.43f);
		System.out.println(f1);
		
		Gerente g1 = new Gerente("Helio","557557-57",new Data(7,6,2003),new Data(28,5,2020),7685.55f,"TI",new Data(17,5,4));
		System.out.println(g1);
	}

}
