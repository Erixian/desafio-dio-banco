import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contasCorrentes;
    private List<Conta> contasPoupanca;

    public Banco() {
        this.contasCorrentes = new ArrayList<>();
        this.contasPoupanca = new ArrayList<>();
    }

    public void cadastrarConta(Conta conta){
        //Conta cc = new ContaCorrente(conta);
        //Conta cp = new ContaPoupanca(conta);

       if(conta instanceof ContaCorrente)
           this.contasCorrentes.add(conta);
       else this.contasPoupanca.add(conta);
    }

    public Conta acessarContaCorrente(String titular, String senha){
        Conta conta = new ContaCorrente(titular, senha);
            for(Conta c : contasCorrentes){
                if(c.getTitular().equalsIgnoreCase(conta.getTitular())
                        && c.getSenha().equalsIgnoreCase(conta.getSenha())) {
                    break;
                    return c;
                }
            }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
