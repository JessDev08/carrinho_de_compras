import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[10];
        double[] precos = new double[10];
        int quantidadeProdutos = 0;

        int opcao;

        do {
            System.out.println("\n1 - Adicionar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Calcular total");
            System.out.println("4 - Remover produto");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("Nome do produto: ");
                String nome = scanner.nextLine();

                System.out.println("Preço: ");
                double preco = scanner.nextDouble();

                nomes[quantidadeProdutos] = nome;
                precos[quantidadeProdutos] = preco;

                quantidadeProdutos++;

            } else if (opcao == 2) {
                for (int i = 0; i < quantidadeProdutos; i++) {
                    System.out.println(i + " - " + nomes[i] + " R$ " + precos[i]);
                }

            } else if (opcao == 3) {
                double total = 0;

                for (int i = 0; i < quantidadeProdutos; i++) {
                    total += precos[i];
                }

                System.out.println("Total: R$ " + total);

            } else if (opcao == 4) {
                System.out.print("Digite o índice para remover: ");
                int indice = scanner.nextInt();

                if (indice >= 0 && indice < quantidadeProdutos) {

                    for (int i = indice; i < quantidadeProdutos - 1; i++) {
                        nomes[i] = nomes[i + 1];
                        precos[i] = precos[i + 1];
                    }

                    quantidadeProdutos--;

                } else {
                    System.out.println("Índice inválido!");
                }
            }

        } while (opcao != 0);

        scanner.close();
    }
}