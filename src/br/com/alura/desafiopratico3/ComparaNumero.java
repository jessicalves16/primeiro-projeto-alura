//Peça ao usuário para inserir dois números inteiros.
// Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
package br.com.alura.desafiopratico3;

import java.util.Scanner;

public class ComparaNumero {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroPrimeiro = 0;
        int numeroSegundo = 0;

        System.out.print("Digite o primeiro número inteiro: ");
        numeroPrimeiro = leitor.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        numeroSegundo = leitor.nextInt();

        if (numeroPrimeiro == numeroSegundo){
            System.out.println("Os números são iguais");

        } else if (numeroPrimeiro > numeroSegundo) {
            System.out.println("Primeiro númeiro é maior que o segundo");

        }else{
            System.out.println("Segundo número é maior que o primeiro");
        }

    }
}
