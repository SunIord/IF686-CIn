public class Personagem {
    private double vidaAtual;
    private double vidaMaxima;
    private double energiaAtual;
    private double energiaMaxima;
    private TipoEnergia tipo;

    public Personagem(double vidaMaxima, double energiaMaxima, TipoEnergia tipo) {
        this.vidaMaxima = vidaMaxima;
        this.vidaAtual = vidaMaxima; 
        this.energiaMaxima = energiaMaxima;
        this.energiaAtual = energiaMaxima;
        this.tipo = tipo;
    }

    // Getters
    public double getVidaAtual() {
        return vidaAtual;
    }
    public double getVidaMaxima() {
        return vidaMaxima;
    }
    public double getEnergiaAtual() {
        return energiaAtual;
    }
    public double getEnergiaMaxima() {
        return energiaMaxima;
    }
    // Para usar na main
    public TipoEnergia getTipo() {
        return tipo;
    }

    // Setters
    public void setVidaAtual(double vidaAtual) {
        if (vidaAtual < 0) {
            this.vidaAtual = 0;
        } else if (vidaAtual > vidaMaxima) {
            this.vidaAtual = vidaMaxima;
        } else {
            this.vidaAtual = vidaAtual;
        }
    }
    public void setEnergiaAtual(double energiaAtual) {
        if (energiaAtual < 0) {
            this.energiaAtual = 0;
        } else if (energiaAtual > energiaMaxima) {
            this.energiaAtual = energiaMaxima;
        } else {
            this.energiaAtual = energiaAtual;
        }
    }
}