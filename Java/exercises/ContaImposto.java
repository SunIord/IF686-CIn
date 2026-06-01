public class ContaImposto extends ContaAbstrata{
    private static final double CPMF = 0.001;

    public ContaImposto(String numero, double saldo) {
        super(numero, saldo);
    }

    @Override
        public void creditar(double valor) {
        saldo += valor;
    }
    @Override
    public void debitar(double valor) throws SaldoInsuficienteException {
        double imposto = (valor * CPMF);
        if (valor + imposto <= saldo) {
            saldo -= (valor + imposto);
        } else {
            throws new SaldoInsuficienteException();
        }
    }

}