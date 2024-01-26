package application;

import model.entities.Client;
import model.entities.Order;
import model.entities.OrderItem;
import model.entities.Product;
import model.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com os dados do cliente:");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Data de nascimento (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Entre com os dados do pedido:");
        System.out.print("Status do pedido -> (PROCESSANDO, PAGAMENTO_PENDENTE, ENVIADO, ENTREGUE): ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client);

        System.out.print("Qual a quantidade de itens no pedido? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Entrada #" + i + " Descrição do item:");
            System.out.print("Nome do produto: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Preço do produto: ");
            double productPrice = sc.nextDouble();

            Product product = new Product(productName, productPrice);

            System.out.print("Quantidade: ");
            int quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, productPrice, product);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("RESUMO DO PEDIDO:");
        System.out.println(order);

        sc.close();
    }
}