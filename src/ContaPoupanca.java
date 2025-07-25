public class ContaPoupanca extends Conta{
    public ContaPoupanca(String titular, String senha) {
        super(titular, senha);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupanca ===");
        super.imprimirInfosComuns();
    }
}
