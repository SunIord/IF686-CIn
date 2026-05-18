public class Classe1 {
    private static int x = 3;
    private int y = 2;
    public static void setX(int i) {x = i;}
    public void setY(int i) {y = i;}
    public static int getX() {return x;}
    public int getY() {return y;}
    public int function(int x) {return (Classe1.x * y);}
}