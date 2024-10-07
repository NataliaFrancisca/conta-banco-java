package contas;

public interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);
    void imprimirExtrato();
}

// uma classe abstrata com todos os métodos abstratos
// vai obrigar todo mundo que extender para implementar todos os métodos que tem nele
// cria um contrato entre classe e a interface.
// todo método que está em uma interface é um método publico, então não precisa usar o public
// uma classe abstrata delega para a classe que está extendendo a criação dos métodos
// uma classe abstrata não pode ser instanciada, então não tem sentido alguem instanciar um new ContaTerminal.Conta sem saber se é contaCorrente/contaPoupanca

