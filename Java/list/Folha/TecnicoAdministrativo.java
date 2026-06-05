public class TecnicoAdministrativo extends Funcionario {
    private int nivel;

    public TecnicoAdministrativo(String nome, String cpf, double salarioBase, int nivel) {
        super(nome, cpf, salarioBase);
        this.nivel = nivel;
    }

    @Override
    public double calcularSalarioLiquido() {
        double salarioTotal = getSalarioBase() + (nivel * 200);
        return salarioTotal - (salarioTotal * 0.11);
    }

    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}