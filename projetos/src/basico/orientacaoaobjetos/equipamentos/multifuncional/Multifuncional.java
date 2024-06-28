package orientacaoaobjetos.equipamentos.multifuncional;

import orientacaoaobjetos.equipamentos.copiadora.Copiadora;
import orientacaoaobjetos.equipamentos.digitalizadora.Digitalizadora;
import orientacaoaobjetos.equipamentos.impressoras.Impressora;

public class Multifuncional implements Copiadora, Digitalizadora, Impressora{
    
    public void copiar(){
        System.out.println("MULTIFUNCIONAL COPIANDO");
    }

    public void digitalizar(){
        System.out.println("MULTIFUNCIONAL DIGITALIZANDO");
    }

    public void imprimir(){
        System.out.println("MULTIFUNCIONAL IMPRIMINDO");
    }

}
