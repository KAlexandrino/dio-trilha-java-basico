// TODO: Conhecer e importar a classe Scanner - OK
// Exibir as mensagens para o usuario - OK
// Obter pela Scanner os valores digitados no terminal - OK
// Exibir a mensagem de conta criada  - OK

// importando os recursos que vou utilizar
import java.util.Scanner; // Scanner para ler e armazenar os dados do usuario
import java.util.Locale; // Locale para regionalizar o metodo de dados que vão ser inseridos via usuario

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // Iniciando um novo Scanner e regionalizando o Locale para US
    
        System.out.println("Por favor, digite o número da Conta!");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agencia!");
        scanner.nextLine(); // Utilizando um nextLine para correção de um erro que estava sendo apresentado, descartando uma entrada de dados invalida.
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome completo do titular da conta!");
        String nomeTitular = scanner.nextLine();

        System.out.println("Por favor, digite o saldo atual da conta!");
        double saldo = scanner.nextDouble();

        scanner.close(); //Fechando o Scanner boa boa convenção para não continuar utilizando recursos.

        System.out.printf( // Concatenando utilizando o metodo printf.
    "Olá %s, obrigado por criar uma conta em nosso banco, sua agencia é %s, conta %d e seu saldo %.2f já está disponível para saque.",  
                nomeTitular, 
                agencia,
                conta,
                saldo);
    }
}