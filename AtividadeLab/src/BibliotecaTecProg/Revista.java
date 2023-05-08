package BibliotecaTecProg;

public class Revista extends AcervoDeLeituras {

	public Revista(String titulo, int ano, String autor, int restantes) {
		super(titulo, ano, autor, restantes);
		this.desconto = 0.01;
	}

}
