public class AudioLivro extends Midia implements Avaliavel {
    private String narrador;
    private int somaNotas;
    private int qtdNotas;

    public AudioLivro(String titulo, String autor, int duracaoEmSegundos, String narrador) {
        super(titulo, autor, duracaoEmSegundos);
        this.narrador  = narrador;
        this.somaNotas = 0;
        this.qtdNotas  = 0;
    }

    @Override
    public void reproduzir() {
        incrementarTotalReproducoes();
        System.out.println(tipoDeMidia() + " " + getTitulo() +  " de " + getAutor() + " | Narrador: " + narrador + " | Duração: " + getDuracaoFormatada());
    }

    @Override
    public String tipoDeMidia() {
        return "AudioLivro";
    }

    @Override
    public void avaliar(int nota) {
        if (nota < 1 || nota > 5) {
            System.out.println("Nota inválida! Use valores entre 1 e 5.");
            return;
        }
        somaNotas += nota;
        qtdNotas++;
    }

    @Override
    public double getMediaAvaliacoes() {
        if (qtdNotas == 0) return 0;
        return (double) somaNotas / qtdNotas;
    }
}