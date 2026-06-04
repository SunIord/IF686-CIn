public class FonteMagica implements Restauracao {
    private double eficiencia;

    public FonteMagica(double eficiencia) {
        this.eficiencia = eficiencia;
    }

    @Override
    public void restaurar(Personagem personagem, double quantidadeRecuperada) throws EnergiaIncompativelException {
        if (personagem.getTipo() != TipoEnergia.MANA) {
            throw new EnergiaIncompativelException();
        }
        double manaRecuperada = quantidadeRecuperada * eficiencia;
        personagem.setEnergiaAtual(personagem.getEnergiaAtual() + manaRecuperada);
    }

    @Override
    public void calcularDuracao(double quantidadeRecuperada) {
        double manaEfetivaRecuperada = quantidadeRecuperada * eficiencia;
        double duracao = quantidadeRecuperada / eficiencia;
        System.out.println("Mana efetiva recuperada: " + manaEfetivaRecuperada);
        System.out.println("Duração da restauração: " + duracao + " segundos.");
    }
}