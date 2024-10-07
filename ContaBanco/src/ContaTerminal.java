import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO:Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        String saldoTexto;  
        double saldo;

        // Exibir as mnensagens para o nosso usuário
        System.out.println("Por favor, digite o número da Conta:");
        //Obter pela Scanner os valores digitados no terminal
        numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta:");
        saldoTexto = scanner.nextLine();

        // Substituir vírgulas por pontos, para evitar InputMismatchException
        saldoTexto = saldoTexto.replace(",", ".");
        saldo = Double.parseDouble(saldoTexto);

        // Exibindo a mensagem de conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
