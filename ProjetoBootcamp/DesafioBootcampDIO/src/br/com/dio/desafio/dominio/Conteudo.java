package br.com.dio.desafio.dominio;
// "abstract" é usado quando você tem uma ideia geral, mas vai deixar que outras classes preencham os detalhes.
public abstract class Conteudo {
	
	// Criando uma constante, inserindo a palavra FINAL.
	// Colocando o 'static' é indicando que pode ser acessado de fora
	protected static final double XP_PADRAO = 10d;
	
	private String titulo;
	private String descricao;
	
	public abstract double calcularXP();

		public String getTitulo() {
			return titulo;
		}
	
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
	
		public String getDescricao() {
			return descricao;
		}
	
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
	
	
}
