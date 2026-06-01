public class Banco {
    private RepositorioContas repositorio;
    private double taxaJuros;

    public Banco(RepositorioContas repositorio) {
        this.repositorio = repositorio;
        this.taxaJuros = 0.01;
    }

    public void cadastrar(ContaAbstrata conta) throws ContaJaCadastradaException {
        if (repositorio.existe(conta.getNumero())) {
            throw new ContaJaCadastradaException();
        }
        repositorio.inserir(conta);
    }

    public void creditar(String numero, double valor) throws ContaNaoEncontradaException {
        ContaAbstrata conta = repositorio.procurar(numero);

        if (conta != null) {
            conta.creditar(valor);
            repositorio.atualizar(conta);
        }
    }

    public void debitar(String numero, double valor) throws ContaNaoEncontradaException, SaldoInsuficienteException {
        ContaAbstrata conta = repositorio.procurar(numero);

        if (conta != null) {
            conta.debitar(valor);
            repositorio.atualizar(conta);
        }
    }

    public double getSaldo(String numero) throws ContaNaoEncontradaException {
        ContaAbstrata conta = repositorio.procurar(numero);

        if (conta != null) {
            return conta.getSaldo();
        }

        return 0;
    }

    public void renderJuros(String numero) throws ContaNaoEncontradaException {
        ContaAbstrata conta = repositorio.procurar(numero);

        if (conta != null) {
            double juros = conta.getSaldo() * taxaJuros;
            conta.creditar(juros);
            repositorio.atualizar(conta);
        }
    }

    public void renderBonus(String numero) throws ContaNaoEncontradaException {
        ContaAbstrata conta = repositorio.procurar(numero);

        if (conta instanceof ContaEspecial ce) {
            ce.renderBonus();
            repositorio.atualizar(conta);
        }
    }

    public void transferir(String origem, String destino, double valor) throws ContaNaoEncontradaException, SaldoInsuficienteException {
        ContaAbstrata contaOrigem = repositorio.procurar(origem);
        ContaAbstrata contaDestino = repositorio.procurar(destino);

        if (contaOrigem != null && contaDestino != null) {
            contaOrigem.debitar(valor);
            contaDestino.creditar(valor);

            repositorio.atualizar(contaOrigem);
            repositorio.atualizar(contaDestino);
        }
    }
}
