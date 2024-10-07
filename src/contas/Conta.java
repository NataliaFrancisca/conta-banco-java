package contas;

import cliente.Cliente;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 0;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Conta.SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valor){
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor){
        if(this.saldo < valor){
           throw new RuntimeException("[ERRO]: Valor inválido para realizar um saque");
        } else{
            this.saldo -= valor;
        }
    };

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(this.saldo < valor){
            throw new RuntimeException("[ERRO]: Valor inválido para realizar um saque");
        } else {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    protected void imprimirExtratoComum() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
