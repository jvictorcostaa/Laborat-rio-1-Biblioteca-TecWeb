package BibliotecaTecProg;

public class Emprestimo {
	public Clientes cliente;
	public AcervoDeLeituras publicaçao;
	public Biblioteca verificar;
	public boolean autorizado;
	
	public void addEmprestimos(AcervoDeLeituras livroEmp, Clientes solicitado, Biblioteca biblioteca) {
		if(solicitado.podePegar()) {
			if(livroEmp.temUnidades(livroEmp) && biblioteca.verificarBiblioteca(livroEmp)){
				this.cliente = solicitado;
				this.publicaçao = livroEmp;
				System.out.println(solicitado.nome+" pegou emprestado o livro:"+livroEmp.titulo);
				solicitado.computarTps(livroEmp);
				solicitado.emprestimos.add(livroEmp);
				this.autorizado = true;
			}else {
				System.out.println("Livro requerido indisponível"+"\n");
				this.autorizado = false;
			}			
		}else {
			System.out.println(solicitado.nome+" atingiu o limite de livros emprestados,devolva um livro antes de continuar"+"\n");
		}
	}
	public void mostrarTransiçao() {
		if(this.autorizado == true) {
			System.out.println(this.cliente.getClass().getSimpleName()+":" + this.cliente.nome + " - " + publicaçao.getClass().getSimpleName() + ": " + this.publicaçao.titulo
					+ " - Dias de emprestimo:" + this.cliente.dias());
		}
		
	}
	public void devolverLivro(AcervoDeLeituras livroEmp,Clientes solicitado) {
		if(this.autorizado == true){
			solicitado.emprestimos.remove(livroEmp);
			livroEmp.restantes++;
			solicitado.computarTpsNeg(livroEmp);
			this.autorizado = false;
		}else
			System.out.println(solicitado.nome+" nao possui este livro");
	}
}
