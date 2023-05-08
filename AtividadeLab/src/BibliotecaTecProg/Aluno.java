package BibliotecaTecProg;

import java.util.ArrayList;

public class Aluno extends Clientes{
	public int dias;
	public Aluno(int id, String name) {
		super(id, name);
		emprestimos = new ArrayList<AcervoDeLeituras>();
		dias = 5;
	}	
	public boolean podePegar() {
		if(emprestimos.size()< 1)
		return true;
	else
		return false;
	}
	public int dias() {
		return this.dias;
	}
	public void computarTps(AcervoDeLeituras publicaçao) {
		int contDoa = 1;
		this.TP += 10-(10*publicaçao.desconto);
		if(this.TP>=50*contDoa) {
			contDoa++;
		}
		System.out.println(this.nome+" está com :"+this.TP+"TPs e deve doar :"+(contDoa-1)+"\n");
	}
	public void computarTpsNeg(AcervoDeLeituras publicacao) {
		int contDoa = 1;
		this.TP -= 10-(10*publicacao.desconto);
		if(this.TP>=50*contDoa) {
			contDoa++;
		}
	}
}
