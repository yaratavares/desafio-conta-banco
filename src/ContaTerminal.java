import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, digite seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite o número da conta");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência");
        String agencia = scanner.next();

        System.out.println("Digite o saldo da conta");
        double saldo = scanner.nextDouble();

        System.out.print("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque\n");

        scanner.close();
    }
}
