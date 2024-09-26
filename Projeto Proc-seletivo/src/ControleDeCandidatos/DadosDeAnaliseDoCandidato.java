package ControleDeCandidatos;

import java.util.ArrayList;

public class DadosDeAnaliseDoCandidato {
	
	
	public String[] name;
	public double[] pretensaoSalarial;
	
	
	static void analisarCandidato(double pretensaoSalarial, String name) {
		double salarioBase = 2000.0;
		
		if (salarioBase > pretensaoSalarial ) {
			System.out.println("O(a) candidato(a): " + name + " deseja receber R$: " + pretensaoSalarial);
		}
		else if (salarioBase == pretensaoSalarial) {
			System.out.println("Ligar para o candidato " + name + " com a contra proposta");
		}
		else {
			System.out.println("Candidato " + name + " não selecionado, NEXT.");
		}
	}
	
	/*
	static void valorSenioridade (String senioridade) {
		String nivel1 = "junior";
		String nivel2 = "Pleno";
		String nivel3 = "Senior";
		
		if (nivel1 == "junior") {
			System.out.println("A vaga tem sua senioridade."); 
		} 
		else {
			System.out.println("A vaga não tem sua senioridade");
		}
	}
	*/ 

}
