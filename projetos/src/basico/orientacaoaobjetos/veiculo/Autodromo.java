package orientacaoaobjetos.veiculo;

public class Autodromo {
    public static void main(String[] args) {


        Carro jeep = new Carro();
        jeep.setChassi("788688"); // atribui a Carro o codigo do chassi. Atributo que herdou de Veiculo.
        jeep.ligar();  //Polimorfismo: O mesmo método apresenta formas diferentes (Carro e Moto ligados)

        Moto cg125 = new Moto();
        cg125.setChassi("656869");
        cg125.ligar();         

    }

}
