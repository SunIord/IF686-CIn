/*Crie uma classe 'Produto' para representar produtos de supermercado
Cada produto tem uma descrição (texto), valor (real) e quantidade em estoque (inteiro)
Lembre-se de definir métodos para ler e alterar atributos dos produtos*/

public class Produto {
    private String descricao;
    private double valor;
    private int qtdEstoque;

    public Produto(String descricaoInicial, double valorInicial, int qtdEstoqueInicial) {
        descricao = descricaoInicial;
        valor = valorInicial;
        qtdEstoque = qtdEstoqueInicial;
    }

    public String getDescricao() {
        return descricao;
    }
    public double getValor() {
        return valor;
    }
    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
}

class Main {
    public static void main(String[] args) {
        Produto p = new Produto("Amido de milho", 5.49, 72);
        
        // Exibindo dados iniciais
        System.out.println("Produto: " + p.getDescricao());
        System.out.println("Valor: " + p.getValor());
        System.out.println("Estoque: " + p.getQtdEstoque());

        // Alterando valores
        p.setDescricao("Maizena");
        p.setValor(6.00);
        p.setQtdEstoque(80);

        // Exibindo após alterações
        System.out.println("\nApós atualização:");
        System.out.println("Produto: " + p.getDescricao());
        System.out.println("Valor: " + p.getValor());
        System.out.println("Estoque: " + p.getQtdEstoque());
    }
}