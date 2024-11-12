import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BancoApp {
    private static List<Conta> contas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean sair = false;

        while (!sair) {
            System.out.println("==== Banco Digital ====");
            System.out.println("1. Criar Conta Corrente");
            System.out.println("2. Criar Conta Poupança");
            System.out.println("3. Depositar");
            System.out.println("4. Sacar");
            System.out.println("5. Transferir");
            System.out.println("6. Ver Extrato");
            System.out.println("7. Aplicar Rendimento em Conta Poupança");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    criarContaCorrente();
                    break;
                case 2:
                    criarContaPoupanca();
                    break;
                case 3:
                    depositar();
                    break;
                case 4:
                    sacar();
                    break;
                case 5:
                    transferir();
                    break;
                case 6:
                    verExtrato();
                    break;
                case 7:
                    aplicarRendimento();
                    break;                
                case 8:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        System.out.println("Obrigado por usar nosso banco!");
    }

    private static void criarContaCorrente() {
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.next();
        Cliente cliente = new Cliente(nome);
        Conta conta = new ContaCorrente(cliente);
        contas.add(conta);
        System.out.println("Conta Corrente criada com sucesso! Número da conta: " + conta.getNumeroConta());
    }

    private static void criarContaPoupanca() {
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.next();
        Cliente cliente = new Cliente(nome);
        Conta conta = new ContaPoupanca(cliente);
        contas.add(conta);
        System.out.println("Conta Poupança criada com sucesso! Número da conta: " + conta.getNumeroConta());
    }

    private static Conta buscarConta() {
        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();
        for (Conta conta : contas) {
            if (conta.getNumeroConta() == numero) {
                return conta;
            }
        }
        System.out.println("Conta não encontrada!");
        return null;
    }

    private static void depositar() {
        Conta conta = buscarConta();
        if (conta != null) {
            System.out.print("Digite o valor para depositar: ");
            double valor = scanner.nextDouble();
            conta.depositar(valor);
        }
    }

    private static void sacar() {
        Conta conta = buscarConta();
        if (conta != null) {
            System.out.print("Digite o valor para sacar: ");
            double valor = scanner.nextDouble();
            conta.sacar(valor);
        }
    }

    private static void transferir() {
        System.out.println("Conta de origem:");
        Conta origem = buscarConta();
        if (origem != null) {
            System.out.println("Conta de destino:");
            Conta destino = buscarConta();
            if (destino != null) {
                System.out.print("Digite o valor para transferir: ");
                double valor = scanner.nextDouble();
                origem.transferir(valor, destino);
            }
        }
    }

    private static void verExtrato() {
        Conta conta = buscarConta();
        if (conta != null) {
            conta.imprimirExtrato();
        }
    }

    private static void aplicarRendimento() {
        Conta conta = buscarConta();
        if (conta instanceof ContaPoupanca) {
            ((ContaPoupanca) conta).aplicarRendimento();
        } else {
            System.out.println("Essa conta não é uma conta poupança.");
        }
    }
}
