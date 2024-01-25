//Crie um programa que solicite ao usuário a entrada de um número inteiro.
// Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.

package br.com.alura.desafiopratico3;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroDigitado = scanner.nextInt();

        if (numeroDigitado % 2 == 0){
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }
    }
}
