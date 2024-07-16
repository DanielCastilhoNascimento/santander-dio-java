public class TestandoStrategy {
    public static void main(String[] args) {
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo(normal);
        robo.setComportamento();        

        robo = Robo(defensivo);
        robo.setComportamento();
        robo.setComportamento();

        robo = robo(agressivo);
        robo.setComportamento();
        robo.setComportamento();
        robo.setComportamento();
        
        System.out.println("----------------");

        robo.setComportamento(normal);
        robo.setComportamento(defensivo);
        robo.setComportamento(agressivo);

        System.out.println("=================");


    }

}
