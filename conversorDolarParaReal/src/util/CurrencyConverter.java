package util;

public class CurrencyConverter {

    public static double conversorDollarReal(double valorDolar, double quantidadeDolar){
        return (quantidadeDolar * valorDolar) + 0.06 * quantidadeDolar * valorDolar;
    }
}
