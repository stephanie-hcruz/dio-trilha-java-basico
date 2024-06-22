import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua Conta:");
        int numero = scanner.nextInt();

        System.out.println("Digite sua Agência:");
        String agencia = scanner.next();

        System.out.println("Digite seu Nome:");
        String nome = scanner.next();

        System.out.println("Digite o saldo que deseja sacar:");
        double saldo = scanner.nextDouble(); 

        System.out.println("Olá " + nome + " " + "obrigado por criar uma conta em nosso banco");
        System.out.println("Sua agência é " + agencia + " " + "e sua conta " + numero + " "); 
        System.out.println("Seu saldo de " + saldo + " " + "já está disponível para saque.");
    
    }

}
