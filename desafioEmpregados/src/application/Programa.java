package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregados;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Empregados> list = new ArrayList<>();

        System.out.print("Quantos empregados quer cadastrar?");
        int numeroEmpregados = sc.nextInt();

        for (int i = 1; i <= numeroEmpregados; i++) {
            System.out.println();
            System.out.println("Empregado #" + i + ":");

            System.out.print("ID: ");
            int idNumero = sc.nextInt();
            while (hasId(list, idNumero)){
                System.out.print("ID já existente! Tente novamente: ");
                idNumero = sc.nextInt();
            }

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            double salario = sc.nextDouble();
            list.add(new Empregados(idNumero, nome, salario));
        }

        System.out.print("Entre com o ID do empregado que será alterado o salário: ");
        int idNumero = sc.nextInt();
        Empregados emp = list.stream().filter(x -> x.getId() == idNumero).findFirst().orElse(null);
        if(emp == null){
            System.out.println("O id não existe!");
        }
        else{
            System.out.print("Digite a porcentagem que será acrescida no salário: ");
            double porcentagem = sc.nextDouble();
            emp.incrementarSalario(porcentagem);
        }

        System.out.println();
        System.out.println("Empregados cadastrados atualizados:");
        for (Empregados obj : list) {
            System.out.println(obj);
        }
        sc.close();
    }

    public static boolean hasId(List<Empregados> list, int id) {
        Empregados emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}