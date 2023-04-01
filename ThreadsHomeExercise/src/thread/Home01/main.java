package thread.Home01;

public class main {

	public static void main(String[] args) {
	
		String name= "da";
		
		Thread threadAssinatura1 = new Thread(new TarefaBuscaTexto("src/assets/assinaturas1.txt", name));
		Thread threadAssinatura2 = new Thread(new TarefaBuscaTexto("src/assets/assinaturas2.txt", name));
		Thread threadAutores = new Thread(new TarefaBuscaTexto("src/assets/autores.txt", name));
		
		threadAssinatura1.start();
		threadAssinatura2.start();
		threadAutores.start();
	}

}
