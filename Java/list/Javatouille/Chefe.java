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
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                for (int j = 0; j < desempenho; j++) {
                    balcao.retirar(new Ingrediente("Consumido_" + id++));
                }
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}