// Crie a classe 'Conta' conforme apresentado em sala
// - atributos ('numero' e 'saldo')
// - métodos ('creditar', 'debitar', 'getNumero', 'getSaldo')

public class Conta extends ContaAbstrata{
    // Construtor
    public Conta(String numeroInicial, double saldoInicial) {
        super(numeroInicial, saldoInicial);
    }

    // Métodos
    @Override
    public void creditar(double valor) {
        saldo += valor;
    } 
    @Override
    public void debitar(double valor) {
        if (valor <= saldo) {saldo -= valor;}
    }
}

// Função Main do slide
/*class Main {
    public static void main(String[] args) {
        Conta c = new Conta("123-X", 8.0);
        c.creditar(10.0);
       c.debitar(5.0);
        System.out.print("Conta "+c.getNumero());
        System.out.print(" saldo "+c.getSaldo());
    }
}*/
// javac Conta.java
// java Main
