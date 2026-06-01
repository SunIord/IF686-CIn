public class Musica extends Midia implements Avaliavel {
    private String genero;

    public Musica(String titulo, String autor, int duracaoEmSegundos, String genero) {
        super(titulo, autor, duracaoEmSegundos);
        this.genero = genero;
    }

    @Override
    public abstract void reproduzir() {
        //
    }

    @Override
    public abstract String tipoDeMidia() {
        //
    }
    
    @Override
    public void avaliar(int nota) {
        //
    }
    
    @Override
    public double getMediaAvaliacoes() {
        //
    }
}