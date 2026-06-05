public class Main {
    public static void main(String[] args) {
        Professor p = new Professor("André Santos", "123.456.789-00", 5000, 2);
        TecnicoAdministrativo t = new TecnicoAdministrativo("Maria Souza", "987.654.321-00", 3000, 3);
        Reitor r = new Reitor("Alfredo Gomes", "111.222.333-44", 8000, 2000);

        Funcionario[] funcionarios = {p, t, r};

        System.out.println("--- SALÁRIOS LÍQUIDOS ---");
        for (Funcionario f : funcionarios) {
            System.out.println(f.getNome() + ": R$ " + f.calcularSalarioLiquido());
        }

        System.out.println("\n--- AUMENTANDO SALÁRIO ---");
        p.aumentarSalario(500);
        t.aumentarSalario(10, true);
        r.aumentarSalario(1000);
        for (Funcionario f : funcionarios) {
            System.out.println(f.getNome() + ": R$ " + f.calcularSalarioLiquido());
        }

        System.out.println("\n--- BÔNUS ---");
        for (Funcionario f : funcionarios) {
            if (f instanceof Bonificavel) {
                Bonificavel b = (Bonificavel) f;
                System.out.println(f.getNome() + ": R$ " + b.calcularBonus());
            }
        }

        System.out.println("\nTotal de funcionários: " + Funcionario.getTotalFuncionarios());
    }
}