
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) 
    {
        
        // Interação com o usuário
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um parâmetro: ");
        int parametro1 = sc.nextInt();
        
        System.out.println("Digite um segundo parâmetro: ");
        int parametro2 = sc.nextInt();

        try {
            contar(parametro1,parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }

    }

    static void contar (int parametro1, int parametro2) throws ParametrosInvalidosException
    {
        if (parametro1 > parametro2)  {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = parametro2 - parametro1;

        for (int i = 0; i < contagem; i++) {
            System.out.println(i + 1);
        }

    }

}
