package contas;

import cliente.Cliente;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato ContaTerminal.Conta Poupança ===");
        super.imprimirExtratoComum();
    }
}


