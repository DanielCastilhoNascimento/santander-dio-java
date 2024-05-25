package orientacaoaobjetos.veiculo;

public class Carro extends Veiculo{

    //herda de veiculo seus atributos e métodos.
    
    public void ligar(){
    confereCambio();
    confereCombustivel();

    System.out.println("Carro ligado");
    }

    private void confereCombustivel(){
        System.out.println("Conferindo combustivel");
    }

    private void confereCambio(){
        System.out.println("Conferindo Cambio");
    }



}
