package br.com.alura.screenmatch;

//Pagina inicial aplicação Screen Match
public class Index {
    public static void main(String[] args){
        System.out.println("Esse é o Screen Match");

        String nomeFilme = "Top Gun Maverick";
        System.out.println("O filme é: " + nomeFilme);

        int anoLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoLancamento);

        boolean incluidoNoPlano = true;
        System.out.println("Está incluso no plano: " + true);

        double notaFilmeA = 8.1;
        double notaFilmeB = 9;
        double notaFilmeC = 7;

        double mediaNotaFilme = (notaFilmeA + notaFilmeB + notaFilmeC) / 3 ;
        System.out.println("A média de notas do filme é: " + mediaNotaFilme);

        //Text blocks como alternativa a linha única do System.out.println
        String sinopse;
        sinopse = """
                Sinopse: 
                Filme de aviões
                Galã velha guarda
                Mulheres bonitas
                E aviões
                """;
        System.out.println(sinopse);


        //Casting: Conversão de tipos. O tipo abaixo é o Casting explicito
        int classificação = (int) (mediaNotaFilme /2);
        System.out.println(String.format("A classificação do filme é %s", classificação));

        //Casting implicito: feito automaticamente pelo compilador quando os tipos de dados são compatíveis
        int x = 10;
        double y = x;
        System.out.println(y);

    }
}
