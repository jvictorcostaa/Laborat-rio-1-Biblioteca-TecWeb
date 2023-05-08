package BibliotecaTecProg;

import java.util.ArrayList;
public class Biblioteca {
	public ArrayList<Emprestimo> transiçao;
	public ArrayList<AcervoDeLeituras> acervo;
	public Biblioteca() {
		transiçao = new ArrayList<Emprestimo>();
		acervo = new ArrayList<AcervoDeLeituras>();
	}
	public void addPublicaçao(AcervoDeLeituras publicacao) {
		acervo.add(publicacao);
	}
	public boolean verificarBiblioteca(AcervoDeLeituras publicacao) {
		return this.acervo.contains(publicacao);
	}
	public void addTransiçao(Emprestimo e1) {
		transiçao.add(e1);
	}
	public void mostrarLivros() {
		for (AcervoDeLeituras acervoDeLeituras : acervo) {
			System.out.println(acervoDeLeituras.getClass().getSimpleName()+": "+acervoDeLeituras.titulo+"; "+acervoDeLeituras.autor+
					"; "+acervoDeLeituras.ano+"; "+acervoDeLeituras.restantes);
		}
	}
	public void relatorio(){
		for (Emprestimo emprestimo : transiçao) {
			emprestimo.mostrarTransiçao();
		}
		System.out.println();
	}

}

