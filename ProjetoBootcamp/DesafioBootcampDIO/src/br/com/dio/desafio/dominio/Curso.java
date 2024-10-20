package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
	
	// atributos
	private int cargaHoraria;
	
	// Metodo criado por causa da abstracao na classe pai Conteudo
	@Override
	public double calcularXP() {
		return XP_PADRAO * cargaHoraria;
	}
	

	
	// Espaço para o construtor
	public Curso() {
		
	}
	
		public int getCargaHoraria() {
			return cargaHoraria;
		}
		public void setCargaHoraria(int cargaHoraria) {
			this.cargaHoraria = cargaHoraria;
		}
	
	public String toString() {
		return "Curso { "
				+ "Titulo = "
				+ getTitulo()
				+ " - "
				+ "Descricao "
				+ getDescricao()
				+ " - "
				+ "Carga horaria: "
				+ cargaHoraria 
				+ " / "
				+ "Voce ganhou essa quantidde de XP: "
				+ calcularXP()
				+ " } ";
	}
}
