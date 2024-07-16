     /**
     * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
     */

public class SingletonProprietarioDoPreguicoso {

     private static class ProprietarioInstancia{
        public static SingletonProprietarioDoPreguicoso instancia = new SingletonProprietarioDoPreguicoso();
     } 
        
     private SingletonProprietarioDoPreguicoso(){
        super();
     }

     public static SingletonProprietarioDoPreguicoso getInstancia(){
        return ProprietarioInstancia.instancia;
     }

}
