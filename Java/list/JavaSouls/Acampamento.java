public class Acampamento implements Restauracao {
    private double eficiencia;

    public Acampamento(double eficiencia) {
        this.eficiencia = eficiencia;
    }

    @Override
    public void restaurar(Personagem personagem, double quantidadeRecuperada) throws EnergiaIncompativelException {
        if (personagem.getTipo() != TipoEnergia.ESTAMINA) {
            throw new EnergiaIncompativelException();
        }
        double estaminaRecuperada = quantidadeRecuperada * eficiencia;
        personagem.setEnergiaAtual(personagem.getEnergiaAtual() + estaminaRecuperada);
    }

    @Override
    public void calcularDuracao(double quantidadeRecuperada) {
        double estaminaEfetivaRecuperada = quantidadeRecuperada * eficiencia;
        double duracao = quantidadeRecuperada / eficiencia;
        System.out.println("Estamina efetiva recuperada: " + estaminaEfetivaRecuperada);
        System.out.println("Duração da restauração: " + duracao + " segundos.");
    }
}