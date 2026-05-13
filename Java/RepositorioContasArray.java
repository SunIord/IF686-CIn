public class RepositorioContasArray implements RepositorioContas {
    private ContaAbstrata[] contas;
    private int indice; 

    public RepositorioContasArray() {
        contas = new ContaAbstrata[100];
        indice = 0;
    }

    @Override 
    public void inserir(ContaAbstrata conta) {
        contas[indice] = conta;
        indice++;
    }
    
    @Override
    public ContaAbstrata procurar(String numero) {
        for (int i = 0; i < indice; i++) {
            if (contas[i].getNumero().equals(numero)) {
                return contas[i];
            }
        }
        return null;
    }
    
    @Override
    public void remover(String numero) {
        for (int i = 0; i < indice; i++) {
            if (contas[i].getNumero().equals(numero)) {
                contas[i] = contas[indice - 1];
                contas[indice - 1] = null;
                indice--;
            }
        }
    }
    
    @Override
    public void atualizar(ContaAbstrata conta) {
        for (int i = 0; i < indice; i++) {
            if (contas[i].getNumero().equals(conta.getNumero())) {
                contas[i] = conta;
            }
        }
    }
    
    @Override
    public boolean existe(String numero) {
        for (int i = 0; i < indice; i++) {
            if (contas[i].getNumero().equals(numero)) {
                return true;
            }
        }
        return false;
    }
}
