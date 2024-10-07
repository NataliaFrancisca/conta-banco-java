# DIO - Projeto - Conta Banco 

`Projeto realizado para práticar o que foi aprendido no módulo de Sintaxe`

[Repositório do Projeto](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe)

## Desafio
- [X] Crie o projeto ContaBanco que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
- [X] Dentro do projeto, crie a classe contaTerminal.contaTerminal.java para realizar toda a codificação do nosso programa.

## Arquivos
- `contaTerminal:` a parte lógica da conta.
- `Conta:` classe que representa uma conta bancária.
  
## Entrada de dados:

```java
    conta.setNome(scanner.nextLine()); // String
    conta.setNumero(scanner.nextInt()); // int
    conta.setAgencia(scanner.next()); // String
    conta.setSaldo(scanner.nextDouble()); // double
    
```

## Saída de dados:

```java
    -BANCO JAVA -
    Olá NATALIA FRANCISCA, obrigado por criar uma conta em nosso banco.
    Agência:012-3
    Conta:1290
    Saldo:R$ 1200,00
```

## Melhorias:
- [ ] Tratar as entradas de dados.
- [ ] Retornar mensagens de erros quando o dado é inválido.