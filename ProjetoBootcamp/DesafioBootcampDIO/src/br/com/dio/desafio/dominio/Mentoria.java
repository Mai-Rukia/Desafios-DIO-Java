package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	
	// Metodo criado por causa da abstracao na classe pai Conteudo
	@Override
	public double calcularXP() {	
		return XP_PADRAO + 20d;
	}
	
	
	// atributos
	private LocalDate data; /* LocalDate avalia a hora local somente */
	
	// Espaço para o construtor
	public Mentoria() {
		
	}
		
		
		public LocalDate getData() {
			return data;
		}
		public void setData(LocalDate data) {
			this.data = data;
		}
	
		public String toString() {
			return "Mentoria { "
					+ "Titulo = "
					+ getTitulo()
					+ " - "
					+ "Descricao "
					+ getDescricao()
					+ " - "
					+ "Data: "
					+ data 
					+ " / "
					+ "Voce ganhou essa quantidde de XP: "
					+ calcularXP()
					+ " } ";
		}



	
}
