public class Fogueira implements Restauracao {
    private double eficiencia;

    public Fogueira(double eficiencia) {
        this.eficiencia = eficiencia;
    }

    @Override
    public void restaurar(Personagem personagem, double quantidadeRecuperada) {
        double vidaRecuperada = quantidadeRecuperada * eficiencia;
        personagem.setVidaAtual(personagem.getVidaAtual() + vidaRecuperada);
    }

    @Override
    public void calcularDuracao(double quantidadeRecuperada) {
        double vidaEfetivaRecuperada = quantidadeRecuperada * eficiencia;
        double duracao = quantidadeRecuperada / eficiencia;
        System.out.println("Vida efetiva recuperada: " + vidaEfetivaRecuperada);
        System.out.println("Duração da restauração: " + duracao + " segundos.");
    }
}