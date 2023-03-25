import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n;

            System.out.print("Digite um número inteiro positivo: ");
            n = scanner.nextInt();

            // Imprime todos os quadrados menores que n
            int i = 1;
            System.out.print("a) Quadrados menores que " + n + ": ");
            while (i * i < n) {
                System.out.print(i * i + " ");
                i++;
            }
            System.out.println();

            // Imprime todos os números divisíveis por 10 e menores que n
            i = 10;
            System.out.print("b) Números positivos divisíveis por 10 e menores que " + n + ": ");
            while (i < n) {
                System.out.print(i + " ");
                i += 10;
            }
            System.out.println();

            // Imprime todas as potências de dois menores que n
            i = 1;
            System.out.print("c) Potências de dois menores que " + n + ": ");
            while (i < n) {
                System.out.print(i + " ");
                i *= 2;
            }
            System.out.println();
        }
}
