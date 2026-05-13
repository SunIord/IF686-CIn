public class Programa {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Conta c1 = new Conta("1", 1000);
        Poupanca p1 = new Poupanca("2", 1000);
        ContaEspecial ce = new ContaEspecial("3", 1000);
        ContaImposto ci = new ContaImposto("4", 1000);

        banco.cadastrar(c1);
        banco.cadastrar(p1);
        banco.cadastrar(ce);
        banco.cadastrar(ci);

        banco.debitar("4", 100);

        System.out.println(ci.getSaldo());
    }
}