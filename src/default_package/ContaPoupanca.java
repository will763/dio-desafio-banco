package default_package;

public class ContaPoupanca extends Conta {

    @Override
    public void ImprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.ImprimirInfosComuns();
    }

}
