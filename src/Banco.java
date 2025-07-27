import javax.swing.*;
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
       if(conta instanceof ContaCorrente)
           this.contasCorrentes.add(conta);
       else this.contasPoupanca.add(conta);
    }

    public boolean verificarContaCorrente(String titular, String senha){
        Conta conta = new ContaCorrente(titular, senha);
        boolean flag = false;
        for(Conta c : contasCorrentes){
            if(c.getTitular().equalsIgnoreCase(conta.getTitular())
                    && c.getSenha().equalsIgnoreCase(conta.getSenha())){
                flag = true;
            }
            else{
                flag = false;
            }
        }
        return flag;
    }

    public Conta acessarContaCorrente(String titular, String senha){
        Conta cc = new ContaCorrente(titular, senha);
            for(Conta c : contasPoupanca){
                if(c.getTitular().equalsIgnoreCase(cc.getTitular())
                        && c.getSenha().equalsIgnoreCase(cc.getSenha())){
                    cc = c;
                }
                else{
                    System.out.println("Conta nao cadastrada!");
                }
            }
            return cc;
    }

    public Conta acessarContaPupanca(String titular, String senha) {
        Conta cp = new ContaPoupanca(titular, senha);
        for (Conta c : contasPoupanca) {
            if (c.getTitular().equalsIgnoreCase(cp.getTitular())
                    && c.getSenha().equalsIgnoreCase(cp.getSenha())) {
                cp = c;
            } else {
                System.out.println("Conta nao cadastrada!");
            }
        }
        return cp;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
