package orientacaoaobjetos.mensageria;

import java.util.Scanner;

import orientacaoaobjetos.mensageria.apps.FacebookMessenger;
import orientacaoaobjetos.mensageria.apps.MSNMessenger;
import orientacaoaobjetos.mensageria.apps.ServicoMensageria;
import orientacaoaobjetos.mensageria.apps.Telegram;

public class ComputadorUsuario {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                
                ServicoMensageria sm = null;

                System.out.println("Ira enviar a msg via msn, facebook ou telegram ?");
                String appEscolhido = scanner.nextLine();

            
                if(appEscolhido.equals("msn")){
                    sm = new MSNMessenger();
                } else if(appEscolhido.equals("facebook")){
                    sm = new FacebookMessenger();
                } else if(appEscolhido.equals("telegram"))
                    sm = new Telegram();
                else{
                    System.out.println("Aplicação Fechada. Entrada incorreta.");
                }
                    sm.enviarMensagem();
                    sm.receberMensagem();                       
        
        scanner.close();
    }

}
