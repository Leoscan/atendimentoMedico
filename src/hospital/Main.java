package hospital;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {

		Scanner menu = new Scanner(System.in);

		Medico m1 = new Medico("12345678910", "Fernando Henrique", "1290909090", 7878787, 1);
		Medico m2 = new Medico("98098012350", "Giovane Augusto", "1278709840", 129012, 2);
		System.out.println(m1);
		System.out.println(m2);

		Fila fila = new Fila();
		//20 pacientes 					
		fila.addPaciente("12332112312", "Antonio Borges", "1233213", "Unimed", 2);
		fila.addPaciente("12332112312", "Julio Borges", "1233213", "Unimed", 2);
		fila.addPaciente("07151104383", "VITORIA MARIA", "1233213", "SUS", 1);
		fila.addPaciente("07644413375", "PAULO HUDSON", "1233213", "Unimed", 4);
		fila.addPaciente("06909550307", "VANESSA NASCIMENTO", "1233213", "SUS", 3);
		fila.addPaciente("12332112312", "TAYNA", "1233213", "Unimed", 1);
		fila.addPaciente("06903399330", "Maria", "1233213", "Unimed", 2);
		fila.addPaciente("08035949330", "Fernando", "1233213", "Unimed", 3);
		fila.addPaciente("61532198370", "Julio", "1233213", "Unimed", 4);
		fila.addPaciente("07463069389", "Antonio", "1233213", "Unimed", 1);
		
		fila.addPaciente("12332112312", "Borges", "1233213", "Unimed", 2);
		fila.addPaciente("12332112312", "augusto", "1233213", "Unimed", 2);
		fila.addPaciente("07151104383", "MARIA", "1233213", "SUS", 1);
		fila.addPaciente("07644413375", "HUDSON", "1233213", "Unimed", 4);
		fila.addPaciente("06909550307", "NASCIMENTO", "1233213", "SUS", 3);
		fila.addPaciente("12332112312", "NaTALIA", "1233213", "Unimed", 1);
		fila.addPaciente("06903399330", "JOAO", "1233213", "Unimed", 2);
		fila.addPaciente("08035949330", "RODRIGO", "1233213", "Unimed", 3);
		fila.addPaciente("61532198370", "JONAS", "1233213", "Unimed", 4);
		fila.addPaciente("07463069389", "DIONIZIO", "1233213", "Unimed", 1);
		
		Historico historico = new Historico();

		// ----Menu-------
		boolean menucontroler = true;
		while (menucontroler) {

			System.out.print("\n##--Menu de Pacientes Covid--##\n");
			System.out.print("|------------------------------|\n");
			System.out.print("| Opção 1 - Novo Cadastro      |\n");
			System.out.print("| Opção 2 - Exibir Fila        |\n");
			System.out.print("| Opção 3 - Exibir Histórico   |\n");
			System.out.print("| Opção 4 - Simular Atendimento|\n");
			System.out.print("| Opção 5 - Sair               |\n");
			System.out.print("|------------------------------|\n");

			System.out.print("Digite uma opção: ");
			int opcao = menu.nextInt();

			if (opcao == 5) {
				System.out.print("\nPrograma Encerrado!");
				menucontroler = false;
			} else {

				// ----------switch Menu-------
				switch (opcao) {
				case 1:
					System.out.println("\nSeja Bem Vindo, primeiro responda essa formulário: ");

					// ------formulario:-----
					Scanner questionario = new Scanner(System.in);
					System.out.println("Seu CPF:");
					String cpf = questionario.nextLine();
					System.out.println("Seu Nome:");
					String nome = questionario.nextLine();
					System.out.println("Seu Telefone:");
					String telefone = questionario.nextLine();
					System.out.println("Nome do seu Plano de Saúde:");
					String planoSaude = questionario.nextLine();

					// ---------define prioridade-----
					System.out.println("Você está ou esteve com Febre?(1-sim 2-não):");
					int primeira = questionario.nextInt();
					System.out.println("Sente Falta de ar?(1-sim 2-não):");
					int segunda = questionario.nextInt();
					System.out.println("Tem Tosse e Congestão Nasal?(1-sim 2-não):");
					int terceira = questionario.nextInt();
					System.out.println("Tem dor no Corpo?(1-sim 2-não):");
					int quarta = questionario.nextInt();

					int contador = 0;
					if (primeira == 1) {
						contador++;
					}
					if (segunda == 1) {
						contador++;
					}
					if (terceira == 1) {
						contador++;
					}
					if (quarta == 1) {
						contador++;
					}

					fila.addPaciente(cpf, nome, telefone, planoSaude, contador);

					break;

				case 2:
					System.out.print("\nExibindo a Fila\n");
					System.out.println(fila);

					// timerzinho
					try {
						TimeUnit.SECONDS.sleep(5);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;

				case 3:
					System.out.print("\nMostrando o Histórico\n");
					System.out.println(historico);
					
					//timerzinho
					try {
						TimeUnit.SECONDS.sleep(5);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;

				case 4:
					System.out.println("Simulando Atendimento .....");
					//simula atendimento
					Atendimento atn = new Atendimento();
					
					//define o medico
					Random random = new Random();        
			        int sortMedico = random.nextInt(2)+1;
			        if (sortMedico == 1) {
			    		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			    		Date date = new Date();
			        	atn.sethAtendimento(dateFormat.format(date));
			        	atn.setMedico(m1);
			        	atn.setPaciente(fila.fPaciente.get(0));
			        	
			        }else {
			        	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			    		Date date = new Date();
			        	atn.sethAtendimento(dateFormat.format(date));
			        	atn.setMedico(m1);
			        	atn.setPaciente(fila.fPaciente.get(0));
			        	
			        	historico.historico.add(atn);
			        }
			        
			     					
			     // tempo de Atendimento
					try {
						TimeUnit.SECONDS.sleep(5);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					fila.removePaciente();
		            
					break;

				default:
					System.out.print("\nOpção Inválida!");
					break;
				}

			}
		}

		menu.close();
	}

}
