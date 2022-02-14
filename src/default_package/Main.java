package default_package;

public class Main {
    public static void main(String[] args) {

        // Faça seus testes

        Conta corrente = new ContaCorrente();
        corrente.Depositar(100);
        Conta poupanca = new ContaPoupanca();

        corrente.Transferir(100,poupanca);

        corrente.ImprimirExtrato();
        poupanca.ImprimirExtrato();
    }
}
