//Programa deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas.
// A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.

package br.com.alura.jogoadivinha;

import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumero {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int numeroDigitado = 0;
        int tentativas = 0;

        while (tentativas < 5) {
            System.out.print("Digite um número entre 0 e 100: ");
            numeroDigitado = leitura.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado){
                System.out.println(String.format("Parabéns, você acertou o número em %s tentativas!", tentativas));
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número digitado é menor que número gerado.");
            } else {
                System.out.println("O número digitado é maior que o número gerado.");
            }
        }

        if (tentativas == 5){
            System.out.println("Você atingiu o número máximo de tentativas. O número era: " + numeroGerado);
        }


    }
}
