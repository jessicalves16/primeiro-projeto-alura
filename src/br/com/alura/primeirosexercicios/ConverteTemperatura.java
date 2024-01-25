package br.com.alura.primeirosexercicios;

public class ConverteTemperatura {
    public static void main(String[] args){
        double temperaturaCelsius = 30.4;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8)+32;
        System.out.println(String.format("A temperatura de %s graus Celsius é equivalente à %s graus Fahrenheit", temperaturaCelsius, temperaturaFahrenheit));

        int fahrenheitFinal = (int) (temperaturaFahrenheit);
        System.out.println(String.format("A temperatura Fahrenheit sem casas decimais é %s", fahrenheitFinal));
    }
}
