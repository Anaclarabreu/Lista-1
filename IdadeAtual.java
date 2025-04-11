import java.util.Scanner;
import java.time.LocalDate;

public class IdadeAtual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anoAtual = LocalDate.now().getYear();

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int idade = anoAtual - anoNascimento;

        System.out.println("Sua idade atual é: " + idade + " anos.");

        scanner.close();
    }
}
