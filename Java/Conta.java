// Crie a classe 'Conta' conforme apresentado em sala
// - atributos ('numero' e 'saldo')
// - métodos ('creditar', 'debitar', 'getNumero', 'getSaldo')

public class Conta {
    // Atributos
    private String numero;
    private double saldo;

    // Construtor
    public Conta(String numeroInicial, double saldoInicial) {
        numero = numeroInicial;
        saldo = saldoInicial;
    }

    // Métodos
    public void creditar(double valor) {
        saldo = saldo + valor;
    } 
    public void debitar(double valor) {
        if (valor <= saldo) {saldo = saldo - valor;}
    }

    // Getters e Setters
    public String getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
}

// Função Main do slide
class Main {
    public static void main(String[] args) {
        Conta c = new Conta("123-X", 8.0);
        c.creditar(10.0);
        c.debitar(5.0);
        System.out.print("Conta "+c.getNumero());
        System.out.print(" saldo "+c.getSaldo());
    }
}
// javac Conta.java
// java Main
