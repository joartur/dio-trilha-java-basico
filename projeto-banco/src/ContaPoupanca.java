public class ContaPoupanca extends Conta {
    private static final double TAXA_RENDIMENTO = 0.02; // 2% de rendimento

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void aplicarRendimento() {
        double rendimento = saldo * TAXA_RENDIMENTO;
        saldo += rendimento;
        System.out.println("Rendimento de R$" + rendimento + " aplicado. Novo saldo: R$" + saldo);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirExtrato();
    }
}
