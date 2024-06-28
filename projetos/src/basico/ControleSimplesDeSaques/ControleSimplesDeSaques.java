import java.util.Locale;
import java.util.Scanner;

public class ControleSimplesDeSaques {

public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner scanner = new Scanner(System.in);
        
//System.out.print("Informe o limite diário de saque: ");
double limiteDiario = scanner.nextDouble();

double saque = 1;


while(saque != 0){  
    System.out.print("Informe o valor do saque : ");
    saque = scanner.nextDouble();  
   
    if(saque < limiteDiario && saque != 0){
        System.out.printf("Saque realizado. Limite restante: %.1f \n", limiteDiario - saque);  
    } else if(saque != 0){
        System.out.println("Limite diario de saque atingido.");
    }  
    };

System.out.println("Transacoes encerradas.");  

scanner.close();
}

}