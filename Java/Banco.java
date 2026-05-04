public class Banco extends Conta {
    private Conta[] contas;
    private int indice;

    Banco () {
        contas = new Conta[100];
        indice = 0;
    }

    public void cadastrar(Conta conta) {
        contas[indice] = conta;
        indice++;
    }

    public void creditar() {
        // a 
    } 

    public void debitar() {
        // b
    }

    // getSaldo
    // void macaco
}

class Programa {
    public static void main(String[] args) {
        //
    }
}