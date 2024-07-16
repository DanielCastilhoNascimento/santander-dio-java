public class SingletonPreguicoso {

     private static SingletonPreguicoso instancia;

     private SingletonPreguicoso(){
        super();
     }

     public static SingletonPreguicoso getInstancia(){
      if(instancia == null){
         instancia = new SingletonPreguicoso();
      }
      return instancia;
     }  

}
