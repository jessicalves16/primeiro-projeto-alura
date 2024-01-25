//Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.

package br.com.alura.desafiopratico3;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro maior que 1: ");
        int numeroDigitado = scanner.nextInt();

        int fatorial = 1;


        for (int i = 1; i <= numeroDigitado ; i++) {
            fatorial *= i;
        }

        System.out.println("O valor final do Fatorial de " + numeroDigitado + " é " + fatorial);

        }
        

    }

