import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
      var resp = 0;
      Banco banco = new Banco();

      while(true){
          System.out.println("=== Bem vindo ao BrazBank! ===");
          System.out.println("1 -  Acessar conta");
          System.out.println("2 -  Cadastrar");
          System.out.println("3 -  Sair");
          System.out.println("==============================");

          resp = sc.nextInt();

          switch (resp){
              case 1:
                  System.out.println("========Tela de acesso========");
                  System.out.print("Informe o nome do titular: ");
                  String titular1 = sc.next();
                  System.out.print("Informe a senha de acesso: ");
                  String senha1 = sc.next();

                  banco.acessarConta(
              case 2:
                  System.out.println("========Tela de cadastro========");
                  System.out.print("Informe o nome do titular: ");
                  String titular = sc.next();
                  System.out.print("Informe a senha de acesso: ");
                  String senha = sc.next();
                  System.out.println("Informe o tipo de conta que deseja cadastrar: ");
                  System.out.println("1 - Conta Corrente");
                  System.out.println("2 -  Conta Poupanca");
                  System.out.println("========Tela de cadastro========");
                  var tipo = sc.nextInt();

                  Conta conta = Conta.criarConta(tipo, titular, senha);
                  banco.cadastrarConta(conta);

                  conta.imprimirExtrato();
                  break;
          }
      }

    }

}
