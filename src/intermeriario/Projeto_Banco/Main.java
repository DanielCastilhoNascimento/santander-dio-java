public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc.depositar(500);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc.transferir(400, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato(); 

    }

}
