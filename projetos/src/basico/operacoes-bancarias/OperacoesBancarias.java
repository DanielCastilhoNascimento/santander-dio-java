import java.util.Locale;
import java.util.Scanner;

public class OperacoesBancarias {       
    
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner scanner = new Scanner(System.in); 
            double saldo = 0;
            boolean emOperacao = true;       

            while (emOperacao == true) { 
                
                int opcao = scanner.nextInt();

                double valorDigitadoCliente = 0;

                switch (opcao) {
                    case 1:
                        valorDigitadoCliente = scanner.nextDouble();
                        saldo += valorDigitadoCliente;
                        System.out.printf("Saldo atual: %.1f \n", saldo);
                        break;
                    
                    case 2:
                        valorDigitadoCliente = scanner.nextDouble();                       
                        if(valorDigitadoCliente < saldo ){
                            saldo -= valorDigitadoCliente;
                            System.out.printf("Saldo atual: %.1f \n", saldo);
                        }else{
                                System.out.println("Saldo insuficiente.");
                            }
                        break;
                    
                    case 3:
                        System.out.printf("Saldo atual : %.1f \n", saldo);
                        break;

                    case 0:
                        emOperacao = false;
                        break;               
                          
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break; 
                }          
            
        }
        scanner.close();
        System.out.println("Programa encerrado.");
    }
}



