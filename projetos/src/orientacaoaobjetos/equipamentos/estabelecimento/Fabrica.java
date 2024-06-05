package orientacaoaobjetos.equipamentos.estabelecimento;

import orientacaoaobjetos.equipamentos.copiadora.Copiadora;
import orientacaoaobjetos.equipamentos.digitalizadora.Digitalizadora;
import orientacaoaobjetos.equipamentos.impressoras.Impressora;
import orientacaoaobjetos.equipamentos.multifuncional.Multifuncional;

public class Fabrica {
    public static void main(String[] args) {
       Multifuncional teste = new Multifuncional();

       Impressora impressora = teste;
       Digitalizadora digitalizadora = teste;
       Copiadora copiadora = teste;

       impressora.imprimir();
       digitalizadora.digitalizar();
       copiadora.copiar();

    }
}
