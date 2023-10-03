package registro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();

        while (true) {
            System.out.println("Digite o nome do cliente (ou 'sair' para finalizar):");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            Cliente cliente = new Cliente(nome);

            while (true) {
                System.out.println("Digite o nome do produto (ou 'fim' para finalizar):");
                String nomeProduto = scanner.nextLine();
                if (nomeProduto.equalsIgnoreCase("fim")) {
                    break;
                }

                System.out.println("Digite o preço do produto:");
                double precoProduto = scanner.nextDouble();
                scanner.nextLine(); // Consume newline

                cliente.adicionarProduto(new Produto(nomeProduto, precoProduto));
            }

            clientes.add(cliente);
            System.out.println("");
        }
        System.out.println("");

        // Exibindo informações dos clientes
        for (Cliente cliente : clientes) {
            System.out.println("Informações do Cliente: " + cliente.getNome());
            System.out.println("Produtos Adquiridos:");
            for (Produto produto : cliente.getProdutosAdquiridos()) {
                System.out.println("- " + produto.getNome() + ": R$" + produto.getPreco());
            }
            System.out.println("Total das Compras: R$" + cliente.calcularTotalCompras());
            System.out.println("-------------------------");
        }
    }
}