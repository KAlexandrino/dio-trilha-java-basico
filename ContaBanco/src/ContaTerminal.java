        //TODO: Conhecer e importar a classe Scanner
        // Exibir as mensagens para o usuario
        // Obter pela Scanner os valores digitados no terminal
        // Exibir a mensagem de conta criada 

import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        System.out.println("Por favor, digite o número da Conta!");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agencia!");
        scanner.nextLine();
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome completo do titular da conta!");
        String nomeTitular = scanner.nextLine();

        System.out.println("Por favor, digite o saldo atual da conta!");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.printf(
    "Olá %s, obrigado por criar uma conta em nosso banco, sua agencia é %s, conta %d e seu saldo %.2f já está disponível para saque.", 
                nomeTitular, 
                agencia,
                conta,
                saldo);
    }
}