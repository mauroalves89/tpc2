import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        double total = 0.0;

        System.out.println("Bem-vindo à máquina de venda automática!");
        while (opcao != 6) {
            System.out.println("\nSelecione uma opção:");
            System.out.println("[1] – Sumo");
            System.out.println("[2] – Bolo");
            System.out.println("[3] – Chocolate");
            System.out.println("[4] – Batatas Fritas");
            System.out.println("[5] – Total a pagar");
            System.out.println("[6] - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Aqui está o seu sumo!");
                    total += 1.0;
                    break;
                case 2:
                    System.out.println("Aqui está o seu bolo!");
                    total += 1.5;
                    break;
                case 3:
                    System.out.println("Aqui está o seu chocolate!");
                    total += 1.2;
                    break;
                case 4:
                    System.out.println("Aqui estão as suas batatas fritas!");
                    total += 1.8;
                    break;
                case 5:
                    System.out.printf("Total a pagar: %.2f$\n", total);
                    break;
                case 6:
                    System.out.println("Obrigado por utilizar a máquina de venda automática!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, selecione novamente.");
                    break;
            }
        }
        scanner.close();
    }
}