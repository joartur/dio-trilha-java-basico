public class ContaCorrente extends Conta {
    private static final double TAXA_SAQUE = 5.00; // Taxa fixa para saque
    private static final double TAXA_TRANSFERENCIA = 2.50; // Taxa fixa para transferência

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + TAXA_SAQUE;
        if (valor > 0 && saldo >= valorComTaxa) {
            saldo -= valorComTaxa;
            System.out.println("Saque de R$" + valor + " realizado com sucesso. Taxa de R$" + TAXA_SAQUE + " aplicada.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        double valorComTaxa = valor + TAXA_TRANSFERENCIA;
        if (valor > 0 && saldo >= valorComTaxa) {
            super.sacar(valor);
            saldo -= TAXA_TRANSFERENCIA; // Aplica a taxa após a transferência
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso. Taxa de R$" + TAXA_TRANSFERENCIA + " aplicada.");
        } else {
            System.out.println("Saldo insuficiente ou valor de transferência inválido.");
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirExtrato();
    }
}

