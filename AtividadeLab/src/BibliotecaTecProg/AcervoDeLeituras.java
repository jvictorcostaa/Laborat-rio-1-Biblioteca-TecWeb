package BibliotecaTecProg;

public abstract class  AcervoDeLeituras {
	protected String titulo;
	protected int ano;
	protected String autor;
	protected int restantes;
	protected Biblioteca coleçao;
	protected double desconto;
	
	public AcervoDeLeituras(String titulo, int ano, String autor, int restantes) {
		this.titulo = titulo;
		this.ano = ano;
		this.autor = autor;
		this.restantes = restantes;
		
	}
	public boolean temUnidades(AcervoDeLeituras livroEmp) {
		if(restantes>0) {
			this.restantes--;
			return true;
		}
			else
				return false;
	}
}