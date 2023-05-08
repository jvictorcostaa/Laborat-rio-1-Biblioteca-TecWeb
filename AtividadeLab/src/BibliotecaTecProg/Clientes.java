package BibliotecaTecProg;

import java.util.ArrayList;

public abstract class Clientes {
	protected int matricula;
	protected String nome;
	protected float TP;
	protected boolean emprestar;
	protected ArrayList<AcervoDeLeituras> emprestimos;
	
	public Clientes(int id,String name) {
		matricula = id;
		nome = name;
		this.TP = 0;
	}
	
	public abstract boolean podePegar();
	public abstract int dias();
	public abstract void computarTps(AcervoDeLeituras publicacao);
	public abstract void computarTpsNeg(AcervoDeLeituras publicacao);
	

}