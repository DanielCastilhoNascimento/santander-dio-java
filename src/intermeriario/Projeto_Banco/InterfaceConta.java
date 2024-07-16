public interface InterfaceConta {

    void sacar(double valor);           //todos os métodos em uma interface são publicos.

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();

}
