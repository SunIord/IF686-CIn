public abstract class ContaAbstrata {
    private String numero;
    protected double saldo;
    
    public ContaAbstrata(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public abstract void creditar(double valor);

    public abstract void debitar(double valor) throws SaldoInsuficienteException;

    public String getNumero() {
        return numero;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
