public class Programa {
    public static void main(String[] args) {
        RepositorioContas repositorio = new RepositorioContasArray();
        Banco banco = new Banco(repositorio);
        Conta c1 = new Conta("1", 1000);

        try {
            banco.cadastrar(c1);
            System.out.println("Conta cadastrada com sucesso.");
        } catch (ContaJaCadastradaException e) {
            System.out.println(e.getMessage());
        }

        try {
            banco.cadastrar(c1);
        } catch (ContaJaCadastradaException e) {
            System.out.println(e.getMessage());
        }

        try {
            banco.debitar("1", 5000);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (ContaNaoEncontradaException e) {
            System.out.println(e.getMessage());
        }

        try {
            banco.debitar("999", 100);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (ContaNaoEncontradaException e) {
            System.out.println(e.getMessage());
        }
    }
}