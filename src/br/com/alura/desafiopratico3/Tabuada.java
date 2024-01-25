//Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.

package br.com.alura.desafiopratico3;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDigitado = 0;
        int numeroFinal = 0;

        System.out.print("Digite um número de 1 a 10: ");
        numeroDigitado = scanner.nextInt();

        System.out.println("Tabuada do " + numeroDigitado + ": ");
        for (int i = 0; i <= 10; i++) {
            numeroFinal = i * numeroDigitado;
            System.out.println(numeroDigitado + " * " + i + " = " + numeroFinal);
        }

    }
}
