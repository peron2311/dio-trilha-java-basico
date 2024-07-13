import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:"Conhecer e importar a classe Scanner"
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as Mensagens para nosso usuário
        System.out.println("Por favor, digite o Nome do Cliente");
        //Obter pela scanner os valores digitados no terminal
        String nome = scanner.next();

         //Exibir as Mensagens para nosso usuário
         System.out.println("Por favor, digite o Numero da Conta!");
         //Obter pela scanner os valores digitados no terminal
         int conta = scanner.nextInt();

         //Exibir as Mensagens para nosso usuário
         System.out.println("Por favor, digite o número da Agência !");
         //Obter pela scanner os valores digitados no terminal
         String agencia = scanner.next();

          //Exibir as Mensagens para nosso usuário
          System.out.println("Por favor, digite o Saldo!");
          //Obter pela scanner os valores digitados no terminal
          double saldo = scanner.nextDouble();

        //Exibir a mensagem conta criada
        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo "+saldo+" já está disponível para saque\"");

        scanner.close();



    }
}
