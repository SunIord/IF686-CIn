public abstract class Midia {
    private String titulo;
    private String autor;
    private int duracaoEmSegundos;
    private static int totalReproducoes = 0;

    public Midia(String titulo, String autor, int duracaoEmSegundos) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public abstract void reproduzir();
    public abstract String tipoDeMidia();

    public String getDuracaoFormatada() {
        int minutos = duracaoEmSegundos / 60;
        int segundos = duracaoEmSegundos % 60;
        
        if (segundos < 10) {return minutos + ":0" + segundos;}
        return minutos + ":" + segundos;
    }

    public static int getTotalReproducoes() {
        return totalReproducoes;
    }
    
    protected void incrementarTotalReproducoes() {
        totalReproducoes++;
    }
}