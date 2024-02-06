package application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados da conta:");
        System.out.print("Numero da conta: ");
        int numeroConta = sc.nextInt();
        System.out.print("Titular da conta: ");
        sc.nextLine();
        String nomeProprietarioConta = sc.nextLine();
        System.out.print("Saldo inicial: ");
        Double saldoInicial = sc.nextDouble();
        System.out.print("Limite de saque: ");
        Double limiteSaque = sc.nextDouble();

        Account account = new Account(numeroConta, nomeProprietarioConta, saldoInicial, limiteSaque);

        //System.out.print(account);

        System.out.println();

        System.out.print("Entre com o valor à sacar: ");
        Double saque = sc.nextDouble();

        try{
            account.withdraw(saque);
            System.out.printf("Novo saldo: %.2f%n", account.getBalance());
        }
        catch (DomainException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}