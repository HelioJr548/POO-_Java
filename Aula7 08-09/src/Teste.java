import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(new Aluno("Julio","123123-09",new Data(1,1,2000),"1221-098", 0));
		pessoas.add(new Pessoa("Maria","341123-09",new Data(12,10,1985)));
		pessoas.add(new Professor("Pedro","123123-09",new Data(1,1,2000),"1251-098"));
		
		for (Pessoa p : pessoas)
			System.out.println(p.toString());
	}

}
