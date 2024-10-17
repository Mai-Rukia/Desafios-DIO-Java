package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		// Instanciar os objetos da classe
		Curso curso1 = new Curso(); Curso curso2 = new Curso();
		Mentoria mentoria = new Mentoria();
		
		/* Espaco para incluir informações nos Objetos da classe Curso */
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Aprenda do basico ao intermediario Java");
		curso1.setCargaHoraria(8);
		
		curso2.setTitulo("Curso Front-ent");
		curso2.setDescricao("Aprenda a desenvolver uma pagina web.");
		curso2.setCargaHoraria(12);
		
		/* Imprimir valores dos objetos */
		
		System.out.println(curso1);
		System.out.println(curso2);
		
		
		/* Espaco para incluir informações nos Objetos da classe Mentoria */
		
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Tudo o que voce precisa saber para dar um passo para o mundo de desenvolvimento back-end com Java. Aproveite e tire suas duvidas conosco.");
		mentoria.setData(LocalDate.now());
		
		/* Imprimir valores dos objetos */
		System.out.println(mentoria);
		
	}

}
