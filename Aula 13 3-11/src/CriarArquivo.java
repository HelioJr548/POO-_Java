import java.io.File;
import java.io.IOException;

public class CriarArquivo {

	public static void main(String[] args) {
		try {
			File myObj = new File("filename.txt"); // Instanciando Objeto p/ manipulação do arquivo
			if (myObj.createNewFile()) { // Tentando criar arquivo e verificando se arquivo foi criado
				System.out.println("Arquivo criado: "+ myObj.getName());
			} else {
				System.out.println("Arquivo já existe!.");
			}
			
		} catch (IOException e) {
			System.out.println("Ocorreu um erro .");
			e.printStackTrace();
		}

	}

}
