package hospital;

import java.util.ArrayList;
import java.util.List;

public class Historico {
	public List<Atendimento> historico  = new ArrayList<Atendimento>();

	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		for (Atendimento atendimento : historico) {
			builder.append(atendimento.toString());
		}
		
		return builder.toString();
	}
	
	
	
}
