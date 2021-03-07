package hospital;


public class Paciente extends Pessoa{
	private String planoSaude;
	private String hChegada;
	private String prioridade;
	private int nPrioridade;
	
	
	public Paciente(String cpf, String nome, String telefone, String planoSaude) {
		super(cpf, nome, telefone);
		setPlanoSaude(planoSaude);
	}
	
	public Paciente() {
		super();
	}
	
	public String getPlanoSaude() {
		return planoSaude;
	}
	public void setPlanoSaude(String planoSaude) {
		if (planoSaude.length() > 0)
			this.planoSaude = planoSaude;
	}
	public String gethChegada() {
		return hChegada;
	}
	public void sethChegada(String hChegada) {
		this.hChegada = hChegada;
	}
	public String getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(String prioridade) {
		if (prioridade.length() > 0)
			this.prioridade = prioridade;
	}	
	public int getnPrioridade() {
		return nPrioridade;
	}

	public void setnPrioridade(int nPrioridade) {
		this.nPrioridade = nPrioridade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("-----------------");
		builder.append("\n Plano de Saude:");
		builder.append(planoSaude);
		builder.append(",\n Horário de Chegada=");
		builder.append(hChegada);
		builder.append(",\n Prioridade=");
		builder.append(prioridade);
		builder.append(super.toString());
		return builder.toString();
	}
		
}
