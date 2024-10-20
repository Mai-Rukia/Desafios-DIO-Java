package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {
	private String nome;
	private String descricao;
	private LocalDate datainicial = LocalDate.now();
	private LocalDate datafinal = datainicial.plusDays(45);
	
	private Set<Dev> devsInscritos = new HashSet<>(); // Lista de Devs inscritos (sem repetição de nomes)
	private Set<Conteudo> conteudos = new LinkedHashSet<>(); // Lista ordenada de conteudos concluidos.
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getDatainicial() {
		return datainicial;
	}
	public void setDatainicial(LocalDate datainicial) {
		this.datainicial = datainicial;
	}
	public LocalDate getDatafinal() {
		return datafinal;
	}
	public void setDatafinal(LocalDate datafinal) {
		this.datafinal = datafinal;
	}
	public Set<Dev> getDevsInscritos() {
		return devsInscritos;
	}
	public void setDevsInscritos(Set<Dev> devsInscritos) {
		this.devsInscritos = devsInscritos;
	}
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	@Override
	public int hashCode() {
		return Objects.hash(conteudos, datafinal, datainicial, descricao, devsInscritos, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BootCamp other = (BootCamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(datafinal, other.datafinal)
				&& Objects.equals(datainicial, other.datainicial) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(devsInscritos, other.devsInscritos) && Objects.equals(nome, other.nome);
	}
	
	
	

}
