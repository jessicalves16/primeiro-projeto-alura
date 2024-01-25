package br.com.alura.screenmatch;

import java.util.Scanner;

//Usando a classe Scanner para leitura de dados no terminal
public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento do seu filme favorito:");
        int anoLancamento = leitura.nextInt();

        System.out.println("Digite sua avaliação para o filme");
        double notaFilme = leitura.nextDouble();


        System.out.println("O filme " + filme + "foi lançado em " + anoLancamento + " sua nota para o filme é " + notaFilme);

        leitura.close();
    }
}
