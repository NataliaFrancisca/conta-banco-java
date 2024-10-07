# DIO - Projeto - Conta Banco 

`Projeto realizado para práticar o que foi aprendido no módulo de Sintaxe e Orientação a Objetos`

[Repositório do Projeto](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe)

## Desafio
- [X] Crie o projeto ContaBanco que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
- [X] Dentro do projeto, crie a classe contaTerminal.contaTerminal.java para realizar toda a codificação do nosso programa.
- [X] Crie as classes que representam um banco: Conta Corrente, Conta Poupança, Cliente e Banco.
- [X] Aplique os conhecimentos de POO como: Polimorfismo, Herança, Abstração e Encapsulamente.  

## Pacotes
- `contaTerminal`: projeto antigo sem usar POO e usando a entrada de dados do usuário.
- `contas`: classes que representam uma conta como Conta, ContaCorrente, ContaPoupança e uma interface IConta
- `cliente`:  classe Cliente com atributo nome
- `banco`: uma classe Banco onde tem uma lista para armazenar as contas
  
## Entrada de dados:

| Conta com a entrada de dados usando o scanner 
```java
    conta.setNome(scanner.nextLine()); // String
    conta.setNumero(scanner.nextInt()); // int
    conta.setAgencia(scanner.next()); // String
    conta.setSaldo(scanner.nextDouble()); // double
    
```

| Conta usando dados diretamente no código
```java
    Conta contaCorrente = new ContaCorrente(new Cliente("Natalia"));
    Conta contaPoupanca = new ContaPoupanca(new Cliente("Luiz"));

    contaCorrente.depositar(100);
    contaCorrente.transferir(100, contaPoupanca);

    contaCorrente.imprimirExtrato();
    contaPoupanca.imprimirExtrato();
```

## Saída de dados:

```java
    -BANCO JAVA -
    Olá NATALIA FRANCISCA, obrigado por criar uma conta em nosso banco.
    Agência:012-3
    Conta:1290
    Saldo:R$ 1200,00
```

```java
    === Extrato Conta Corrente ===
      Titular: Natalia
      Agencia: 1
      Numero: 0
      Saldo: 0,00
    
    === Extrato Conta Poupança ===
      Titular: Luiz
      Agencia: 1
      Numero: 1
      Saldo: 100,00
```

## Melhorias:
- [ ] Tratar as entradas de dados.
- [ ] Retornar mensagens de erros quando o dado é inválido.
