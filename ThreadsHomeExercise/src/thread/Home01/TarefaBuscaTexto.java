package thread.Home01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBuscaTexto implements Runnable {

	private String nomeArquivo;
	private String nome;

	public TarefaBuscaTexto(String nomeArquivo, String nome) {
		this.nomeArquivo = nomeArquivo;
		this.nome = nome;
	}

	@Override
	public void run() {
		try {
			Scanner scanner = new Scanner(new File(nomeArquivo));

			int numeroLinha = 1;

			while (scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				if (linha.toLowerCase().contains(nome.toLowerCase())) {
					System.out.println(nomeArquivo + " - " + numeroLinha + " - " + linha);
				}
				numeroLinha++;
			}
			scanner.close();

		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encottrado");
			//e.printStackTrace();
			 throw new RuntimeException(e);
		}

	}

}
