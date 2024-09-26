package ControleDeCandidatos;

import java.util.Locale;
import java.util.Scanner;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Chamando a classe
		DadosDeAnaliseDoCandidato processosInternos = new DadosDeAnaliseDoCandidato();
		
		int n = 3;
		
		processosInternos.name = new String[n];
		processosInternos.pretensaoSalarial = new double[n];
		
		//String[] nomesCandidatos = new 
		for (int i = 0; i < n; i++) {
		
			System.out.println("Bem-Vindo ao Processo Seletivo!");
			System.out.println("Para te conhecer melhor, digite o seu nome: ");
			processosInternos.name[i] = sc.next();			
			
			System.out.println("Salario pretendido: ");
			processosInternos.pretensaoSalarial[i] = sc.nextDouble();	
		}
		
		for (int i = 0; i < n; i++) {
			processosInternos.analisarCandidato(processosInternos.pretensaoSalarial[i], processosInternos.name[i]);
		}
	}

}
