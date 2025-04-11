import java.util.Scanner;

public class SalarioMInimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salario minimo: ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Digite o seu salario: ");
        double salarioUsuario = scanner.nextDouble();

        double quantidade = salarioUsuario / salarioMinimo;

        System.out.printf("Voce ganha %.2f salarios minimos.%n", quantidade);

        scanner.close();
    }
}