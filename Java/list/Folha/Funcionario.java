public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;
    private static int totalFuncionarios = 0;

    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
        totalFuncionarios++;
    }

    public abstract double calcularSalarioLiquido();

    public void aumentarSalario(double valor) {
        this.salarioBase += valor;
    }

    public void aumentarSalario(double valor, boolean ehPercentual) {
        if (ehPercentual) {
            this.salarioBase += this.salarioBase * (valor / 100);
        } else {
            aumentarSalario(valor);
        }
    }

    public static int getTotalFuncionarios() {
        return totalFuncionarios;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    // Setters
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}