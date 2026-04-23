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
        } while (opcao != 0);

            scanner.close();
        }
    }
