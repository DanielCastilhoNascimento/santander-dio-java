package IPhone7;

public class ReprodutorMusical{

    String nomeMusica;

    public void tocar(String nomeMusica) {
        System.out.println("Reproduzindo " + nomeMusica);
    }

    public void pausar() {
        System.out.println("\nDaMúsica pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }
}



