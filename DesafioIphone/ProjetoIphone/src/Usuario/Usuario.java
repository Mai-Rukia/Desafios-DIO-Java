package Usuario;

import java.util.Scanner;

import Iphone.iPhone;

public class Usuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		iPhone Iphone = new iPhone();
		
		//Iphone.fazerLigacao(190);
		
		Iphone.receberLigacao();
		Iphone.resp = sc.next();
		Iphone.atender();
		
		Iphone.selecionarMusica();
		sc.nextLine(); // <- nextLine extra para consumir o buffer
		Iphone.musica = sc.nextLine();
		Iphone.tocar();
		
		System.out.println("Digite uma pagina / URL web ");
		Iphone.url = sc.nextLine();
		Iphone.exibirPagina(Iphone.url);
		Iphone.adicionarNovaAba();
		Iphone.atualizarPagina();
	}

}
