package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Application {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;


        System.out.print("Enter account number: ");
        int numeroDaConta = sc.nextInt();

        System.out.print("Enter account holder: ");
        String nome = sc.next();

        System.out.print("Is there na initial deposit (y/n)? " );
        char resposta = sc.next().charAt(0);

        if(resposta == 'y'){
            System.out.print("Enter initial deposit value: ");
            double valorDepositoInicial = sc.nextDouble();
            account = new Account(numeroDaConta, nome, valorDepositoInicial);
        }
        else {
            account = new Account(numeroDaConta, nome);
        }

        System.out.print("\nEnter a deposit value: ");
        double deposito = sc.nextDouble();
        account.deposit(deposito);

        System.out.print("Update account data:");
        System.out.print(account);

        System.out.println();

        System.out.print("\nEnter a withdraw value: ");
        double saque = sc.nextDouble();
        account.withdraw(saque);

        System.out.print("Update account data:");
        System.out.print(account);

        sc.close();
    }
}