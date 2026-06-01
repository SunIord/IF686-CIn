public class Teste {
    public static void main(String args[]) {
        Classe1 a = new Classe1();
        Classe1 b = new Classe2();
        Classe2 c = new Classe2();
        a.setX(5); b.setX(7); c.setX(9);
        a.setY(4); b.setY(6); c.setY(8);
        System.out.println("a.function = " + a.function(10));
        System.out.println("b.function = " + b.function(11));
        System.out.println("c.function = " + c.function(12));
        a = b;
        b = c;
        System.out.println("a.function = " + a.function(13));
        System.out.println("b.function = " + b.function(14));

        try {
            System.out.println(c.function2(0));

        } catch (ParametroZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}