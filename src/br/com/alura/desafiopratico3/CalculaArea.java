//Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo".
// Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
package br.com.alura.desafiopratico3;

import java.util.Scanner;

public class CalculaArea {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int escolhaMenu = 0;
        double ladoQuadrado = 0;
        double areaQuadrado;
        double areaCirculo;
        double raioCirculo = 0;
        double pi = 3.1416;

        //Menu de opções
        while (escolhaMenu != 3){
            String menu = """
                    ------------------ Menu ----------------------
                    Escolha uma das opções abaixo para calcular:
                    1 - Área do quadrado
                    2 - Área do círculo
                    3 - Encerrar
                    """;
            System.out.println(menu);
            escolhaMenu = leitor.nextInt();

            //Calcular área de quadrado ou do círculo
            if (escolhaMenu == 1){
                System.out.print("Digite a medida do lado do quadrado: ");
                ladoQuadrado = leitor.nextDouble();
                areaQuadrado = ladoQuadrado * ladoQuadrado;
                System.out.println("A área do quadrado é: " + areaQuadrado);
                System.out.println(" ");


            } else if(escolhaMenu == 2){
                System.out.print("Digite a medida do raio do círculo: ");
                raioCirculo = leitor.nextDouble();
                areaCirculo = pi * raioCirculo * raioCirculo;
                System.out.println("A área do círculo é: " + areaCirculo);
                System.out.println(" ");


                //Encerrar programa
            } else if (escolhaMenu == 3){
                System.out.println("O programa foi encerrado.");
                leitor.close();

            } else {
                System.out.println("Opção inválida. Escolha novamente.");
            }
        }


    }
}
