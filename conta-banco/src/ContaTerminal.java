//Conhecer e importar a classe Scanner
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        //Exibir as mensagens para nosso usuário
        //Obter pela Scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da agencia: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o úmero da sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite seu saldo: ");
        double saldo = scanner.nextDouble();
        

        //Exibir a mensagem conta criada
        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco");
        System.out.println("sua agência é " + agencia); 
        System.out.println("conta " + conta);
        System.out.println("E seu saldo R$ " + saldo +" já está disponível para saque.");

    }
}
