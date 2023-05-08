package BibliotecaTecProg;

import java.util.ArrayList;

public class Servidores extends Clientes {
	public int dias;
	public Servidores(int id, String name, float money) {
		super(id, name);
		emprestimos = new ArrayList<AcervoDeLeituras>();
		dias = 7;
		
	}
	public boolean podePegar() {
		if(emprestimos.size()< 7)
		return true;
		else
			return false;
	}
	public int dias() {
		return this.dias;
	}
	public void computarTps(AcervoDeLeituras publicacao) {
		int contDoa = 1;
		this.TP += 15;
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
