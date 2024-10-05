package Iphone;

import Iphone.AparelhoTelefonico.aplicativoTelefone;
import Iphone.Navegacao.Internet;
import Iphone.ReprodutorMusical.Ipod;

public class iPhone implements aplicativoTelefone, Ipod, Internet {
	/*
	 * |---------------------------------------------|
	 * | Espaço reservado para o aplicativo Telefone |
	 * |---------------------------------------------|
	*/
		public String resp;
	//Funções
		public void agenda() {	
			System.out.println("Contatos Salvos");
		}
		@Override
		public void fazerLigacao(int numero) {
			if (numero == 190) {
				System.out.println("Ligando para a policia.");
			} 
			else if(numero != 190) {
				System.out.println("Fazendo uma ligacaoo para: " + numero);
			}
		}
		
		public void receberLigacao() {
			System.out.println("Recebendo ligacao.");
		}
		
		public void atender() {
			if (resp.equals("Sim")) {
				System.out.println("Falando com a pessoa da outra linha");
			}
			else {
				iniciarCorreioVoz();
			}
		}
		
		public void iniciarCorreioVoz() {
			System.out.println("O numero que voce ligou nao esta disponivel no momento. Por favor deixe sua mensagem");
		}
		
		public void desligarLigacao() {
			System.out.println("Desligando a ligação.");
		}

	/*
	 * |---------------------------------------------|
	 * | Espaço  reservado  para o  aplicativo  Ipod |
	 * |---------------------------------------------|
	*/
		
		public String musica;
		
		@Override
		public void selecionarMusica(String musica) {
			
		}
		
		public void selecionarMusica() {
			System.out.println("Selecione uma musica");
		}
		
		public void tocar() {
			System.out.println(musica);
		}
		
		public void pausar() {
			
		}
		
		public void parar() {
			
		}

	
	/*
	 * |---------------------------------------------|
	 * | Espaço reservado para o aplicativo Browser  |
	 * |---------------------------------------------|
	*/
		
		public String url;
		
		public void exibirPagina(String url) {
			System.out.println("Acessando a pagina " + url);
		}
		

		public void adicionarNovaAba() {
			System.out.println("Adicionando nova pagina");
		}

		public void atualizarPagina() {
			System.out.println("Atualizando pagina....");
			System.out.println("Pagina atualizada");
		}
		
		
}
