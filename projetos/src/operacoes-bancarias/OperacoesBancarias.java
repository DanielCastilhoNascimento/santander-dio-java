
import java.util.Locale;
import java.util.Scanner;

public class OperacoesBancarias {       
    
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner scanner = new Scanner(System.in); 
            double saldo = 0;
            boolean emOperacao = true;
            

            System.out.println("          Banco S/A");
            System.out.println("============================");
            System.out.println("Opções : ");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("0 - Encerrar");
            System.out.println("============================");
                        
            while (emOperacao == true) { 
                
                int opcao = scanner.nextInt();

                double valorDigitadoCliente = 0;

                switch (opcao) {
                    case 1:
                        System.out.print("Valor a ser depositado : ");
                        valorDigitadoCliente = scanner.nextDouble();
                        saldo += valorDigitadoCliente;
                        break;
                    
                    case 2:
                        System.out.print("Valor a ser sacado : ");
                        valorDigitadoCliente = scanner.nextDouble();
                        if(valorDigitadoCliente < saldo ){
                            saldo -= valorDigitadoCliente;}
                            else{
                                System.out.println("Saldo insuficiente");
                            }
                        break;
                    
                    case 3:
                        System.out.printf("Saldo atual : %.2f", saldo);
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
        System.out.println("Operação encerrada! Obrigado por utilizar nossos serviços");
    }
}



