package br.com.alura.primeirosexercicios;

public class FormataTexto {
    public static void main(String[] args){
        String nome = "Maria";
        int idade = 25;
        double valor = 55.9999;

        //Método format() para substituição de place holders na exibição
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

        //Método formatted pode ser usado para blocos de texto
        String nome2 = "Jéssica";
        int aulas = 4;
        String mensagem = """
                Olá, %s!
                Boas vindas ao curso de Java.
                Teremos %d aulas para te mostrar o que é preciso para se tornar um dev Java.
                """.formatted(nome2, aulas);
        System.out.println(mensagem);


    }
}
