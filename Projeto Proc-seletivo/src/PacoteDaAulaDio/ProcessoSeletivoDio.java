package PacoteDaAulaDio;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivoDio {

	public static void main(String[] args) {
		
		selecaoCandidato();
	}
	
	static void imprimirSelecionados() {
		String[] candidatos = {"Ruth","Fernanda", "Rafael", "Gustavo", "Felipe", "Juliana", "Renesme", "Rebecca", "Aline", "Mery"};
	}
	
	
	static void selecaoCandidato() {
		String[] candidatos = {"Ruth","Fernanda", "Rafael", "Gustavo", "Felipe", "Juliana", "Renesme", "Rebecca", "Aline", "Mery"};
		
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		
		while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			if (salarioBase >= salarioPretendido) {
				System.out.println("O(A) candidato(a) " + candidato + " foi selecionado para a vaga, querendo ganhar R$: " + salarioPretendido);
				candidatosSelecionados++;
			}
			candidatosAtual++;
		}
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2500);
	}
	
	
	static void analisarCandidato (double salarioPretendido) {
		double salarioBase = 2000.0;
		if (salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato");
		}
		else if (salarioBase==salarioPretendido) {
			System.out.println("Ligar para o candidato com uma contra-proposta");
		}
		else {
			System.out.println("Aguardando o resultado dos demais candidatos");
		}
	}

}
