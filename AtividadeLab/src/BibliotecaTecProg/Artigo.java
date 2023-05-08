package BibliotecaTecProg;

public class Artigo extends AcervoDeLeituras{

	public Artigo(String titulo, int ano, String autor, int restantes) {
		super(titulo, ano, autor, restantes);
		this.desconto = 0.5;
	}
	
}
