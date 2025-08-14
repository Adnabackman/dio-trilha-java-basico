import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0.0;

        System.out.println("Por favor, digite o número da conta!");
        numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite número da Agência!");
        agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Por favor, digite o seu nome completo!");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta!");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    
        scanner.close();
    }
}
