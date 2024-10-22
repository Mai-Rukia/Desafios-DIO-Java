package DesafioCodigo;

import java.util.Scanner;

public class ConexaoInternet {
	
	// Função para calcular a velocidade média de conexão de internet
    public static double calcularVelocidadeMedia(String[] velocidades) {
        int total = 0;
        
        /* Se tratando de uma lista, é usado o for para percorrer ela desta forma */
        for (String velocidade : velocidades) {
        	total = total + Integer.parseInt(velocidade); // Aqui vc usa o Total que inicia zerado e soma com a velocidade, mas para isso acontecer, voce usa a classe wrapper Integer.parseInt para converter uma String para um numero inteiro.
        }
               
        // TODO: Some todas as velocidades registradas e calcule a média
        return total / velocidades.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Calculando a velocidade média de conexão
        double velocidadeMedia = calcularVelocidadeMedia(velocidades);

        // Exibindo a velocidade média de conexão
        System.out.println((int)velocidadeMedia + " Mbps");

        scanner.close();
    }
}

