class ContaEspecial extends Conta {
    private double bonus;
    public ContaEspecial(String numero, double saldo) {
        super(numero, saldo);
        bonus = 0;
    }

    public void renderBonus() {
        bonus += getSaldo() * 0.01;
    }

    public double getBonus() {
        return bonus;
    }
}