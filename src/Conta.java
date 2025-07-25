import java.awt.*;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected String titular;
    protected String senha;

    public Conta(String titular, String senha) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.titular = titular;
        this.senha = senha;
    }

    protected Conta() {
    }

    public static Conta criarConta(int tipo, String titular, String senha){
        return switch (tipo){
            case 1 -> new ContaCorrente(titular, senha);
            case 2 -> new ContaPoupanca(titular, senha);
            default -> throw new IllegalArgumentException("Tipo Invalido!");
        };
    }

    @Override
    public void sacar(double valor){
        saldo -= valor;
    }

    @Override
    public void depositar(double valor){
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
        System.out.println("Titular: " + this.titular);
        System.out.printf("Agencia: %d\n", this.agencia);
        System.out.printf("Numero da Conta: %d\n", this.numero);
        System.out.printf("Saldo: %.2f\n", this.saldo);
    }

    public String getTitular(){
        return titular;
    }

    public String getSenha(){
        return senha;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
