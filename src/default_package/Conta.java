package default_package;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta (){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
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

    @Override
    public void Sacar(double valor) {
       this.saldo -= valor;
    }

    @Override
    public void Depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void Transferir(double valor, Conta contaDestino) {
        this.Sacar(valor);
        contaDestino.Depositar(valor);
    }

    protected void ImprimirInfosComuns() {
        System.out.println(String.format("Agencia: %d",this.agencia));
        System.out.println(String.format("Numero: %d",this.numero));
        System.out.println(String.format("Saldo: %.2f",this.saldo));
    }
}
