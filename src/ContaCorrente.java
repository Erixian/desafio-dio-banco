public class ContaCorrente extends Conta{

    public ContaCorrente(String titular, String senha) {
        super(titular, senha);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}
