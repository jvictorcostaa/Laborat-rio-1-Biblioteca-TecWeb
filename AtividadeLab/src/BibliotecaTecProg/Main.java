package BibliotecaTecProg;

public class Main {

	public static void main(String[] args) {
		Biblioteca ufc = new Biblioteca();
		Livro l1 = new Livro("java",2023,"kaka",2);
		Livro l2 = new Livro("java2",2025,"kaka",3);
		Aluno a1 = new Aluno(538100,"jv");
		Professor p1 = new Professor(53820,"Peixer");
		Artigo ar1 = new Artigo("fim da pandemia",2023,"bolsonaro",2);
		//adicionar a publicaçao primeiramente na biblioteca
		ufc.addPublicaçao(ar1);
		ufc.addPublicaçao(l1);
		ufc.addPublicaçao(l2);
		
		Emprestimo e1 = new Emprestimo();
		Emprestimo e2 = new Emprestimo();
		Emprestimo e3 = new Emprestimo();
		//adicionar o emprestimo na biblioteca
		e3.addEmprestimos(ar1, a1, ufc);
		e1.addEmprestimos(ar1,p1,ufc);
		e2.addEmprestimos(l1,p1,ufc);
		
		ufc.addTransiçao(e1);
		ufc.addTransiçao(e2);
		ufc.addTransiçao(e3);
		ufc.relatorio();
		e1.devolverLivro(l1,a1);
		
		ufc.relatorio();
		ufc.mostrarLivros();
	}
}
