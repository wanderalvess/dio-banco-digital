public abstract class Conta implements IConta {
    //Atributos
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    //constantes
    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    //criação de conta
    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfoComum() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d,", this.agencia));
        System.out.println(String.format("Numero: %d,", this.numero));
        System.out.println(String.format("Saldo: %.2f,", this.saldo));
    }

    //Getters
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
