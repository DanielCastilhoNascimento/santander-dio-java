

public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String texto){
        super("O segundo parâmetro deve ser maior que o primeiro");
    }

}

