package br.com.alura.primeirosexercicios;

//Desafio manipulação de variáveis
public class MediaNotas {
    public static void main(String[] args){

       //Media simples de duas variaveis
        double nota1 = 8.5;
        double nota2 = 7.5;
        double media = (nota1 + nota2) / 2;
        System.out.println(String.format("A média das notas no primeiro semestre é %s", media));


        //Casting + calculo media
        double nota3 = 4.6;
        int nota4 = 9;
        int media2 = ((int) nota3 + nota4)/2;
        System.out.println(media2);


        //Concatenar variáveis do tipo texto
        char inicialSobrenome = 'A';
        String primeiroNome = "Jéssica";
        System.out.println(String.format("Meu nome é %s %s.", primeiroNome, inicialSobrenome));


        //Valor total do produto
        double precoProduto = 59.99;
        int quantidade = 5;
        double valorTotal = precoProduto * quantidade;
        System.out.println(String.format("O valor total da compra é R$ %s", valorTotal));


        //Conversão Dolar para Real
        double valorDolar = 1.00;
        double valorReal = valorDolar * 4.94;
        System.out.println(String.format("O valor em reais é R$ %s", valorReal));


        //Calculo de desconto em reais
        double precoOriginal = 22.00;
        double percentualDesconto = 15.00;
        double valorDesconto = (percentualDesconto / 100) * precoOriginal;

        double novoPreco = precoOriginal - valorDesconto;
        String mensagem = """
                ---------------------------
                O preço original era R$%s
                O desconto foi de R$%s
                Novo preço então será R$%s
                """.formatted(precoOriginal, valorDesconto, novoPreco);
        System.out.println(mensagem);


    }
}
