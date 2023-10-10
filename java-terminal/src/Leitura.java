import java.util.Locale;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite sua Altura");
            double altura = scanner.nextDouble();

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Olá, " + nome + " " + sobrenome + ", sua altura com " + idade + " anos de idade é de "
                    + altura + "cm");
        }
    }
}
