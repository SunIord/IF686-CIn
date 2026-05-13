public class Banco {
    private ContaAbstrata[] contas;
    private int indice;
    private double  taxaJuros;

    public Banco () {
        contas = new ContaAbstrata[100];
        indice = 0;
        taxaJuros = 0.01;
    }

    public void cadastrar(ContaAbstrata conta) {
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
        ContaAbstrata contaOrigem = null;
        ContaAbstrata contaDestino = null;
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