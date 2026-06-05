public class Professor extends Funcionario implements Bonificavel {
    private int titulacao;

    public Professor(String nome, String cpf, double salarioBase, int titulacao) {
        super(nome, cpf, salarioBase);
        this.titulacao = titulacao;
    }

    @Override   
    public double calcularSalarioLiquido() {
        double bonus = getSalarioBase() * (0.10 * titulacao);
        double salarioTotal = getSalarioBase() + bonus;
        return salarioTotal - (salarioTotal * 0.11);
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() * (0.05 * titulacao);
    }

    public int getTitulacao() {
        return titulacao;
    }
    public void setTitulacao(int titulacao) {
        this.titulacao = titulacao;
    }
}