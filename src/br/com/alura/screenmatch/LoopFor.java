package br.com.alura.screenmatch;

import java.util.Scanner;

//Usando loop com for
public class LoopFor {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliação para o filme");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }
        System.out.println("A média das avaliações é: " + mediaAvaliacao/3);

        
    }
}
