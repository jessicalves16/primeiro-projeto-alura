package br.com.alura.screenmatch;

public class Condicional {
    public static void main(String[] args) {
        int anoLancamento = 2022;
        boolean incluidoNoPlano = false;
        String tipoPlano = "Normal";

        if(anoLancamento <= 1970){
            System.out.println("Esse é um filme Retrô!");
        } else {
            System.out.println("Esse é um filme atual!");
        }

        if(incluidoNoPlano && tipoPlano.equals("Plus")){
            System.out.println("Pode assistir");
        } else {
            System.out.println("Fazer assinatura");
        }

    }
}
