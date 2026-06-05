import java.util.LinkedList;
import java.util.Queue;

public class Balcao {
    private String nome;
    private int capacidade;
    private Queue<Ingrediente> ingredientes;

    public Balcao(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.ingredientes = new LinkedList<>();
    }

    public synchronized void colocar(Ingrediente ingrediente) throws InterruptedException {
        while (ingredientes.size() >= capacidade) {
            wait();
        }
        ingredientes.add(ingrediente);
        notifyAll();
    }

    public synchronized void retirar(Ingrediente ingrediente) throws InterruptedException { // Não entendi esse parâmetro
        while (ingredientes.isEmpty()) {
            wait();
        }
        ingredientes.poll();
        notifyAll();
    }

    public String getNome() {
        return nome;
    }
    public int getCapacidade() {
        return capacidade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}