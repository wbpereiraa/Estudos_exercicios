package application;

import util.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("What is the dollar price? ");
        double valorDolar = entrada.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double quantidadeDolar = entrada.nextDouble();

        double valorfinal = CurrencyConverter.conversorDollarReal(valorDolar, quantidadeDolar);

        System.out.printf("Amount to be paid in reais =  %.2f ", valorfinal);

        entrada.close();
    }
}