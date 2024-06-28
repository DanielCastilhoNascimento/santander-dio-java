package orientacaoaobjetos.veiculo;

public abstract class Veiculo {

    private String chassi;

    public String getchassi(){
        return chassi;
    }

    public void setChassi(String chassi){
        this.chassi = chassi;
    }

    public abstract void ligar();

}
