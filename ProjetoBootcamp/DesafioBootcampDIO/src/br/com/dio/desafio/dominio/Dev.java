package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	
	// Atributos da classe
	private String nome;
	/* Usando o Set para gerar um conjunto de elementos que não podem ser duplicados */
	/* Chamando tbm o LinkedHashSet p/ manter a ordem de inclusão */
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>(); 
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	
	public void inscreverBootcamp(BootCamp bootcamp) {
		this.conteudosInscritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
	}
	
	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		if (conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
		}
		else {
			System.err.println("Voce nao esta matriculado em nenhum conteudo.");
		}
	}
	
	public double calcularTotalXP() {
		return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXP()).sum();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosInscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev dev = (Dev) obj;
		return Objects.equals(conteudosConcluidos, dev.conteudosConcluidos)
				&& Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(nome, dev.nome);
	}
	
	
	
}
