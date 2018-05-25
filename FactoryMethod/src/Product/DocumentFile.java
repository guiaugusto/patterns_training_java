package Product;

public abstract class DocumentFile {

	public void open() {
		System.out.println("O documento foi aberto com sucesso!");
	}
	
	public void close() {
		System.out.println("O documento foi fechado com sucesso!");
	}
}
