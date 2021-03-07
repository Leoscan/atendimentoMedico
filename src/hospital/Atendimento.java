package hospital;


public class Atendimento {
	private String hAtendimento;
	private Medico medico;
	private Paciente paciente;
	
	public String gethAtendimento() {
		return hAtendimento;
	}
	public void sethAtendimento(String hAtendimento) {
		this.hAtendimento = hAtendimento;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atendimento hAtendimento=");
		builder.append(hAtendimento);
		builder.append(",\n medico=");
		builder.append(medico);
		builder.append(",\n paciente=");
		builder.append(paciente);
		return builder.toString();
	}
	
	
	
	
}
