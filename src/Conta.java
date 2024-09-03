public class Conta {
    private int numero;
    private String agencia;
    private String nome;
    private double saldo;

    public String getAgencia() {
        return this.agencia.substring(0, 3) + '-' + this.agencia.substring(3);
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome.toUpperCase();
    }

    public String getSaldo() {
        return String.format("R$ %.2f", this.saldo);
    }

    public void setAgencia(String agencia) {
        if(agencia.length() > 4 || agencia.length() < 4){
            System.out.println("Digite um agência válida");
        }else{
            this.agencia = agencia;
        }
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
   
    public void setNome(String nome) {
        if(nome.isEmpty()){
            System.out.println("Digite um nome válido");
        }else{
            this.nome = nome;
        }
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void imprimirMensagemBoasVindas(){
        System.out.println("- BANCO JAVA -");
        System.out.println("Olá ".concat(this.getNome()).concat(", obrigado por criar uma conta em nosso banco."));

        System.out.print("\n");
        
        System.out.println("Agência: ".concat(this.getAgencia()));
        System.out.println("Conta: " + this.getNumero());
        System.out.println("Saldo: ".concat(this.getSaldo()));
    }
}
