public class ParametroZeroException extends Exception {
    public ParametroZeroException() {
        super("O parâmetro passado para function2 não pode ser zero.");
    }
}