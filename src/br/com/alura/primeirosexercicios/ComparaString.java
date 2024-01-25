package br.com.alura.primeirosexercicios;

public class ComparaString {
    public static void main(String[] args){

        //Comparando o conteúdo de duas Strings

        String senha = "12345";
        if (senha.equals("12346")){
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta!");
        }
    }
}
