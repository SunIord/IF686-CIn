public class Chefe implements Runnable {
    private Balcao balcao;
    private int desempenho;

    public Chefe(Balcao balcao, int desempenho) {
        this.balcao = balcao;
        this.desempenho = desempenho;
    }

    @Override
    public void run() {
        int id = 1;
        try {
            while (true) {
                Thread.sleep(1000);
                for (int j = 0; j < desempenho; j++) {
                    if (!balcao.retirar(new Ingrediente("Consumido_" + id++))) {
                        return; 
                    }
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}