public class Main {
    public static void main(String[] args) {
        Musica m = new Musica("Creeping Death", "Metallica", 396, "Thrash Metal");
        Podcast p = new Podcast("Xadrez Verbal", "Matias Pinto e Filipe Figueiredo", 14400, 312); // Podia ter horas na formatação tbm
        AudioLivro a = new AudioLivro("Iracema", "José de Alencar", 16200, "Silvero Pereira"); 

        System.out.println("--- Reproduzindo ---");
        m.reproduzir();
        p.reproduzir();
        a.reproduzir();

        // 09/26/1986 Stockholm vibe 
        System.out.println("\n--- Música acelerada ---");
        m.reproduzir(1.5);

        System.out.println("\n--- Avaliações ---");
        m.avaliar(5);
        m.avaliar(4); // opinião burra
        m.avaliar(5);
        System.out.println("Média da música: " + m.getMediaAvaliacoes());

        a.avaliar(5); 
        a.avaliar(3);
        a.avaliar(4);
        System.out.println("Média do audiolivro: " + a.getMediaAvaliacoes());

        System.out.println("\nTotal de reproduções: " + Midia.getTotalReproducoes());
    }
}