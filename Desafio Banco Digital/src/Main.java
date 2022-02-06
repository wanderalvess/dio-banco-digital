public class Main {
    public static void main(String[] args) {
        Cliente wanderson = new Cliente();
        wanderson.setNome("Wanderson");

        Conta corrente = new ContaCorrente(wanderson);
        Conta poupanca = new ContaPoupanca(wanderson);

        corrente.depositar(100);
        corrente.transferir(100, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
