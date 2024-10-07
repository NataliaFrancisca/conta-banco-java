import cliente.Cliente;
import contas.ContaCorrente;
import contas.ContaPoupanca;
import contas.Conta;

public class Main {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente(new Cliente("Natalia"));
        Conta contaPoupanca = new ContaPoupanca(new Cliente("Luiz"));

        contaCorrente.depositar(100);
        contaCorrente.transferir(100, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        contaCorrente.sacar(400);
        contaCorrente.depositar(1000);

        contaCorrente.imprimirExtrato();
    }
}
