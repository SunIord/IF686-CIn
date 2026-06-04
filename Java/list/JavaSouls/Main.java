public class Main {
    public static void main(String[] args) {
        Personagem guerreiro = new Personagem(100, 50, TipoEnergia.ESTAMINA);
        Fogueira fogueira = new Fogueira(0.8);
        
        System.out.println("=== RESTAURAÇÃO DE VIDA ===");
        System.out.println("Vida antes: " + guerreiro.getVidaAtual());
        fogueira.restaurar(guerreiro, 30);
        fogueira.calcularDuracao(30);
        System.out.println("Vida depois: " + guerreiro.getVidaAtual());
        
        Personagem mago = new Personagem(80, 100, TipoEnergia.MANA);
        FonteMagica fonte = new FonteMagica(0.9);
        
        System.out.println("\n=== RESTAURAÇÃO DE MANA (SUCESSO) ===");
        System.out.println("Mana antes: " + mago.getEnergiaAtual());
        try {
            fonte.restaurar(mago, 20);
            fonte.calcularDuracao(20);
            System.out.println("Mana depois: " + mago.getEnergiaAtual());
        } catch (EnergiaIncompativelException e) {
            System.out.println("Isso não deveria acontecer");
        }
        
        System.out.println("\n=== RESTAURAÇÃO DE MANA (INCOMPATÍVEL) ===");
        System.out.println("Energia do guerreiro antes: " + guerreiro.getEnergiaAtual());
        try {
            fonte.restaurar(guerreiro, 20);
            System.out.println("Isso não deveria executar");
        } catch (EnergiaIncompativelException e) {
            System.out.println("Deu ruim: " + e.getMessage());
        }
    }
}