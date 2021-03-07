package hospital;

public class Medico extends Pessoa {
	private int crm;
	private int idMedico;
	
	public Medico() {
		super();
		
	}
		
	public Medico(String cpf, String nome, String telefone, int crm, int idMedico) {
		super(cpf, nome, telefone);
		setCrm(crm);
		setIdMedico(idMedico);
	}



	public int getCrm() {
		return crm;
	}
	public void setCrm(int crm) {
		if (crm > 0)
			this.crm = crm;
	}
	public int getIdMedico() {
		return idMedico;
	}
	public void setIdMedico(int idMedico) {
		if (idMedico > 0)
			this.idMedico = idMedico;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("-----------------");
		builder.append("\n id do Medico:");
		builder.append(idMedico);
		builder.append("\n CRM:");
		builder.append(crm);		
		builder.append(super.toString());
		return builder.toString();
	}
	
	
	
}
