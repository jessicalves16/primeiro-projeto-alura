//Crie um programa que solicite ao usuário digitar um número.
// Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".

package br.com.alura.desafiopratico3;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroUsuario = 0;

        System.out.print("Digite um número, positivo ou negativo: ");
        numeroUsuario = leitor.nextInt();

        if (numeroUsuario >= 0){
            System.out.println("Número positivo!");
        } else {
            System.out.println("Número negativo!");
        }
    }
}
