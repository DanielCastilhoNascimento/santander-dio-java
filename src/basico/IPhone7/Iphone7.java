package IPhone7;

import java.util.*;

public class Iphone7 {

    public static void main(String[] args) {
               
        Scanner scanner = new Scanner(System.in);        

        ReprodutorMusical reprodutorMusical;
        AparelhoTelefonico aparelhoTelefonico;
        NavegadorInternet navegadorInternet;
  
        reprodutorMusical = new ReprodutorMusical();
        aparelhoTelefonico = new AparelhoTelefonico();
        navegadorInternet = new NavegadorInternet();
        
        reprodutorMusical.tocar("It's My Life - Bon Jovi");
        aparelhoTelefonico.ligar("11985856869");
        navegadorInternet.exibirPagina("https://whiplash.net/");

        scanner.close();
        
    }

}
