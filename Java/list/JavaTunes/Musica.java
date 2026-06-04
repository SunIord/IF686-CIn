public class Musica extends Midia implements Avaliavel {
    private String genero;
    private int somaNotas;  
    private int qtdNotas;    

    public Musica(String titulo, String autor, int duracaoEmSegundos, String genero) {
        super(titulo, autor, duracaoEmSegundos);
        this.genero = genero;
        this.somaNotas = 0;
        this.qtdNotas  = 0;
    }

    @Override
    public void reproduzir() {
        incrementarTotalReproducoes();
        System.out.println(tipoDeMidia() + " " + getTitulo() + " de " + getAutor() + " | Gênero: " + genero + " | Duração: " + getDuracaoFormatada());
    }

    public void reproduzir(double velocidade) {
        incrementarTotalReproducoes();
        System.out.println(tipoDeMidia() + " " + getTitulo() +  " de " + getAutor() + " a " + velocidade + "x");
    }

    @Override
    public String tipoDeMidia() {
        return "Música";
    }

    @Override
    public void avaliar(int nota) {
        if (nota < 1 || nota > 5) {
            System.out.println("Nota inválida! Use valores entre 1 e 5."); // A segunda pior forma de fazer isso, o correto seria usar exception
            return;
        }
        somaNotas += nota;
        qtdNotas++;
    }

    @Override
    public double getMediaAvaliacoes() {
        if (qtdNotas == 0) {return 0.0;}
        return (double) somaNotas / qtdNotas;
    }
}