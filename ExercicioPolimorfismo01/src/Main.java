import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        List<Pessoa> list = new ArrayList<>();

        System.out.print("Entre com o número de pessoas para pagamento de taxas: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.println("Pagamento de taxa pessoa #" + i + ":");
            System.out.print("Pessoa Física ou Jurídica (f/j)? ");
            char type = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Renda anual: ");
            double rendaAnual = sc.nextDouble();

            if (type == 'f'){
                System.out.print("Gastos com Saúde: ");
                double gastosComSaude = sc.nextDouble();
                list.add(new PessoaFisica(nome, rendaAnual, gastosComSaude));
            } else if (type == 'j') {
                System.out.print("Quantidade de Funcionários: ");
                int numeroFuncionarios = sc.nextInt();
                list.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
            }
        }

        double soma = 0;
        System.out.println();
        System.out.println("Taxa de Imposto para pagar:");
        for (Pessoa pessoa : list){
            double imposto = pessoa.imposto();
            System.out.println("Imposto a pagar = " + pessoa.getNome() + " é de R$" + String.format("%.2f",pessoa.imposto()));
            soma += imposto;
        }

        System.out.println();
        System.out.println("Total de imposto a pagar = R$" + String.format("%.2f",soma));

        sc.close();
    }
}