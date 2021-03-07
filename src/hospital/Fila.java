package hospital;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Fila {

	public List<Paciente> fPaciente = new ArrayList<Paciente>();

	public String prioridade(int rQuestionario) {
		switch (rQuestionario) {
		case 1:
			return "Não Urgente";
		case 2:
			return "Pouco Urgente";
		case 3:
			return "Urgente";
		case 4:
			return "Emergência";
		default:
			return "Sem Covid";
		}

	}

	public boolean addPaciente(String cpf, String nome, String telefone, String planoSaude, int contador) {

		Paciente p = new Paciente(cpf, nome, telefone, planoSaude);

		// hora atual
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		p.sethChegada(dateFormat.format(date));

		p.setnPrioridade(contador);
		p.setPrioridade(prioridade(contador));

		return fPaciente.add(p);

	}

	public void removePaciente() {
		fPaciente.remove(0);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n Fila: ");
		for (Paciente paciente : fPaciente) {
			builder.append(paciente.toString());
		}
		return builder.toString();
	}

}
