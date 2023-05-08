package BibliotecaTecProg;

import java.util.ArrayList;

public class Professor extends Clientes {
	public int dias;
	public Professor(int id, String name) {
		super(id, name);
		emprestimos = new ArrayList<AcervoDeLeituras>();
		dias = 10;	
	}
	public boolean podePegar() {
		if(emprestimos.size()<10) {
		return true;
		}else {
		return false;
	}
	}
	public int dias() {
		return this.dias;
	}
	public void computarTps(AcervoDeLeituras publicacao) {
		int contDoa = 1;
		this.TP += 25;
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
	