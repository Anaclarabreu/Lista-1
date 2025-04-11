import java.util.Scanner;

public class IPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a porcentagem do IPI: ");
        double ipi = scanner.nextDouble();

        System.out.print("Digite o codigo da peca 1: ");
        int cod1 = scanner.nextInt();
        System.out.print("Digite o valor unitario da peca 1: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Digite a quantidade da peca 1: ");
        int qtd1 = scanner.nextInt();

        System.out.print("Digite o codigo da peca 2: ");
        int cod2 = scanner.nextInt();
        System.out.print("Digite o valor unitario da peca 2: ");
        double valor2 = scanner.nextDouble();
        System.out.print("Digite a quantidade da peca 2: ");
        int qtd2 = scanner.nextInt();

        double total = ((valor1 * qtd1) + (valor2 * qtd2)) * (1 + (ipi / 100));

        System.out.print("Valor total a pagar com IPI: R$ " + total);

        scanner.close();
    }
}