public class TestandoSingleton {

    public static void main(String[] args) {
        SingletonPreguicoso preguica = SingletonPreguicoso.getInstancia();
        System.out.println(preguica);
        preguica = SingletonPreguicoso.getInstancia();
        System.out.println(preguica);

        SingletonApressado apressado = SingletonApressado.getInstancia();
        System.out.println(apressado);
        apressado = SingletonApressado.getInstancia();
        System.out.println(apressado);

        SingletonProprietarioDoPreguicoso proprietarioDoPreguicoso = SingletonProprietarioDoPreguicoso.getInstancia();
        System.out.println(proprietarioDoPreguicoso);
        proprietarioDoPreguicoso = SingletonProprietarioDoPreguicoso.getInstancia();
        System.out.println(proprietarioDoPreguicoso);
        
    }

}
