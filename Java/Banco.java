public class Banco {
    private Conta[] contas;
    private int indice;
    private double  taxaJuros;

    public Banco () {
        contas = new Conta[100];
        indice = 0;
        taxaJuros = 0.01;
    }

    public void cadastrar(Conta conta) {
        contas[indice] = conta;
        indice++;
    }

    public void creditar(String numero, double valor) {
        for (int i = 0; i < indice; i++) {
            if (contas[i].getNumero().equals(numero)) {
                contas[i].creditar(valor);
            }    
        }
    } 

    public void debitar(String numero, double valor) {
        for (int i = 0; i < indice; i++) {
            if (contas[i].getNumero().equals(numero)) {
                contas[i].debitar(valor);
            }
        }
    }

    public double getSaldo(String numero) {
        for (int i = 0; i < indice; i++) {
            if (contas[i].getNumero().equals(numero)) {
                return contas[i].getSaldo();
            }
        }
        return 0;
    }

    public void renderJuros(String numero) {
        for (int i =0; i < indice; i++) {
            if (contas[i].getNumero().equals(numero)) {
                double saldo = contas[i].getSaldo();
                double juros = saldo * taxaJuros;
                contas[i].creditar(juros);
            }
        }
    }

    public void renderBonus(String numero) {
        for (int i = 0; i < indice; i++) {
            if (contas[i].getNumero().equals(numero)) {
                if (contas[i] instanceof ContaEspecial ce) {
                    ce.renderBonus(); 
                }
            }
        }
    }

    public void transferir(String origem, String destino, double valor) {
        Conta contaOrigem = null;
        Conta contaDestino = null;
        for (int i = 0; i < indice; i++) {
            if (contas[i].getNumero().equals(origem)) {
                contaOrigem = contas[i];
            }
            if (contas[i].getNumero().equals(destino)) {
                contaDestino = contas[i];
            }
        }
        if (contaOrigem != null && contaDestino != null) {
            contaOrigem.debitar(valor);
            contaDestino.creditar(valor);
        }
    }
}

class Programa {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Conta c1 = new Conta("001", 100);
        Conta c2 = new Conta("002", 200);
        Conta c3 = new Conta("003", 300);
        ContaEspecial c4 = new ContaEspecial("004", 500);

        banco.cadastrar(c1);
        banco.cadastrar(c2);
        banco.cadastrar(c3);
        banco.cadastrar(c4);

        banco.creditar("001", 50);
        banco.debitar("002", 30);
        banco.creditar("003", 100);

        banco.renderJuros("001");

        banco.renderBonus("004");

        banco.transferir("001", "002", 50);

        System.out.println(banco.getSaldo("001"));
        System.out.println(banco.getSaldo("002"));
        System.out.println(banco.getSaldo("003"));
        System.out.println(banco.getSaldo("004"));

        System.out.println(c4.getBonus());
    }
}