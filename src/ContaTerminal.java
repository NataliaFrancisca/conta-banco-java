import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        Conta conta  = new Conta();

        System.out.println("- BANCO JAVA -");
        System.out.println("Por favor, digite as informações abaixo: ");
        System.out.print("\n");

        System.out.println("Digite o nome do proprietário da conta: ");
        conta.setNome(scanner.nextLine());
  
        System.out.println("Digite o número da sua conta: ");
        conta.setNumero(scanner.nextInt());

        System.out.println("Digite a agencia da sua conta (somente os números):" );
        conta.setAgencia(scanner.next());

        System.out.println("Digite o saldo da conta: ");
        conta.setSaldo(scanner.nextDouble());

        System.out.print("\n");

        conta.imprimirMensagemBoasVindas();
    }
}
