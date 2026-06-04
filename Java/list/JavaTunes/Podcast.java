public class Podcast extends Midia {
    private int episodio;

    public Podcast(String titulo, String autor, int duracaoEmSegundos, int episodio) {
        super(titulo, autor, duracaoEmSegundos);
        this.episodio = episodio;
    }

    @Override
    public void reproduzir() {
        incrementarTotalReproducoes();
        System.out.println(tipoDeMidia() + " " + getTitulo() + " – Episódio " + episodio + " | Apresentador: " + getAutor() + " | Duração: " + getDuracaoFormatada());
    }

    @Override
    public String tipoDeMidia() {
        return "Podcast";
    }
}