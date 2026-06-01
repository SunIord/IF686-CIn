public class Classe2 extends Classe1 {
    @Override
    public int function(int x) {return (getX() + getY() + x);}
    public String function2(int x) throws ParametroZeroException {
        if (x == 0) {
            throw new ParametroZeroException();
        }
        return "Hello";
    }
}