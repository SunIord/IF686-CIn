public class Reitor extends Funcionario implements Bonificavel {
    private double gratificacaoCargo;

    public Reitor(String nome, String cpf, double salarioBase, double gratificacaoCargo) {
        super(nome, cpf, salarioBase);
        this.gratificacaoCargo = gratificacaoCargo;
    }

    @Override
    public double calcularSalarioLiquido() {    
        double salarioTotal = getSalarioBase() + gratificacaoCargo;
        return salarioTotal - (salarioTotal * 0.11);
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() * 0.20;
    }

    public double getGratificacaoCargo() {
        return gratificacaoCargo;
    }
    public void setGratificacaoCargo(double gratificacaoCargo) {
        this.gratificacaoCargo = gratificacaoCargo;
    }
}