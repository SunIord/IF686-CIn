public class Main { // que trabalho
    public static void main(String[] args) {
        System.out.println("==========================================================");
        System.out.println("CASO 1: Balcão com POUCO ESPAÇO (capacidade = 2)");
        System.out.println("==========================================================");
        casoBalcaoPequeno();
        
        System.out.println("\n==========================================================");
        System.out.println("CASO 2: Produção APRENDIZ muito > Consumo CHEFE");
        System.out.println("==========================================================");
        casoProducaoAlta();
        
        System.out.println("\n==========================================================");
        System.out.println("CASO 3: Consumo CHEFE muito > Produção APRENDIZ");
        System.out.println("==========================================================");
        casoConsumoAlto();
    }
    
    public static void casoBalcaoPequeno() {
        Balcao balcao = new Balcao("Balcao", 2);
        Aprendiz aprendiz = new Aprendiz(balcao, 3);
        Chefe chefe = new Chefe(balcao, 1);
        
        System.out.println(">>> Iniciando Caso 1 (balcão pequeno)");
        System.out.println(">>> Balcão capacidade: 2 | Aprendiz: 3 por vez | Chefe: 1 por vez");
        
        long start = System.currentTimeMillis();
        
        Thread ta = new Thread(aprendiz);
        Thread tc = new Thread(chefe);
        ta.start();
        tc.start();
        
        try {
            ta.join();
            tc.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        long end = System.currentTimeMillis();
        System.out.println(">>> Caso 1 finalizado em " + (end - start) + "ms");
        System.out.println(">>> Observação: Aprendiz ficou bloqueado esperando espaço no balcão");
    }
    
    public static void casoProducaoAlta() {
        Balcao balcao = new Balcao("Balcao", 10);
        Aprendiz aprendiz = new Aprendiz(balcao, 5);
        Chefe chefe = new Chefe(balcao, 1);
        
        System.out.println(">>> Iniciando Caso 2 (produção alta)");
        System.out.println(">>> Balcão capacidade: 10 | Aprendiz: 5 por vez | Chefe: 1 por vez");
        
        long start = System.currentTimeMillis();
        
        Thread ta = new Thread(aprendiz);
        Thread tc = new Thread(chefe);
        ta.start();
        tc.start();
        
        try {
            ta.join();
            tc.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        long end = System.currentTimeMillis();
        System.out.println(">>> Caso 2 finalizado em " + (end - start) + "ms");
        System.out.println(">>> Observação: Balcão frequentemente cheio, aprendiz esperando espaço");
    }
    
    public static void casoConsumoAlto() {
        Balcao balcao = new Balcao("Balcao", 10);
        Aprendiz aprendiz = new Aprendiz(balcao, 1);
        Chefe chefe = new Chefe(balcao, 5);
        
        System.out.println(">>> Iniciando Caso 3 (consumo alto)");
        System.out.println(">>> Balcão capacidade: 10 | Aprendiz: 1 por vez | Chefe: 5 por vez");
        
        long start = System.currentTimeMillis();
        
        Thread ta = new Thread(aprendiz);
        Thread tc = new Thread(chefe);
        ta.start();
        tc.start();
        
        try {
            ta.join();
            tc.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        long end = System.currentTimeMillis();
        System.out.println(">>> Caso 3 finalizado em " + (end - start) + "ms");
        System.out.println(">>> Observação: Chefe frequentemente esperando ingredientes (balcão vazio)");
    }
}