import java.util.LinkedList;
import java.util.Queue;

public class Balcao {
    private String nome;
    private int capacidade;
    private Queue<Ingrediente> ingredientes;
    private boolean producaoEncerrada; // Evitar deadlock

    public Balcao(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.ingredientes = new LinkedList<>();
        this.producaoEncerrada = false;  
    }

    public synchronized void colocar(Ingrediente ingrediente) throws InterruptedException {
        while (ingredientes.size() >= capacidade) {
            wait();
        }
        ingredientes.add(ingrediente);
        notifyAll();
    }


    public synchronized boolean retirar(Ingrediente ingrediente) throws InterruptedException { // Não entendi esse paramêtro
        while (ingredientes.isEmpty() && !producaoEncerrada) {
            wait();
        }
        
        if (ingredientes.isEmpty()) {
            return false;
        }
        
        ingredientes.poll();
        notifyAll();
        return true;
    }
    
    public synchronized void encerrarProducao() {
        this.producaoEncerrada = true;
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