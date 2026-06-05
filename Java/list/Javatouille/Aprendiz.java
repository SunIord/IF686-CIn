public class Aprendiz implements Runnable {
    private Balcao balcao;
    private int desempenho;

    public Aprendiz(Balcao balcao, int desempenho) {
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
                    balcao.colocar(new Ingrediente("Ingrediente_" + id++));
                }
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}