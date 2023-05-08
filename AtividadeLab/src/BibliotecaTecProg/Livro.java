package BibliotecaTecProg;

public class Livro extends AcervoDeLeituras{

	public Livro(String titulo, int ano, String autor, int restantes) {
		super(titulo, ano, autor, restantes);
		this.desconto = 0.1;
	}
	
}
