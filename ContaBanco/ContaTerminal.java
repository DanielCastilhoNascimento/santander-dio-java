import java.util.Scanner;

public class ContaTerminal {
/**
 * @param args
 */
public static void main(String[] args) {
    
    int Numero = 100;
    String Agencia;
    String NomeCliente;
    double Saldo;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Cadastro de Contas ");

    Numero++;

    System.out.println("");
    System.out.println("Digite : ");
    System.out.println("");

    System.out.print("Código da agência : ");
    Agencia = scanner.nextLine();

    System.out.print("Nome do cliente   : ");
    NomeCliente = scanner.nextLine();

    System.out.print("Deposito inicial  : ");
    Saldo = scanner.nextDouble();

    System.out.println("");
    System.out.println("");
    
    System.out.printf("Olá, %s. Obrigado por criar a conta em nosso Banco. Sua Agência é %s e seu saldo de R$ %.2f já esta disponível ", NomeCliente, Agencia, Saldo);
    
    scanner.close();
}
}
