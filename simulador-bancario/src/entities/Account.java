package entities;

public class Account {

    private int numeroDaConta;
    private String nome;
    private double balance;

    public Account(int numeroDaConta, String nome, double valorDepositoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.nome = nome;
        deposit(valorDepositoInicial);
    }

    public Account(int numeroDaConta, String nome) {
        this.numeroDaConta = numeroDaConta;
        this.nome = nome;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public  void withdraw(double amount){
        balance -= amount + 5.0;
    }

    public String toString(){
        return "Account "
                + numeroDaConta
                +", Holder: "
                + nome
                +", Balance: $ "
                + String.format("%.2f", balance);

    }
}
