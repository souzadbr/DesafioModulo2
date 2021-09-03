package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio_Modulo2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Map<String, String> funcionario = new HashMap<String, String>();
        int retorno = 0;
        do {
            System.out.println("------------Bem vindo ao sistema de Cadastro de funcionários DBR--------------");
            System.out.println("Menu inicial");
            System.out.println("Digite 1: Para cadastrar funcionários.");
            System.out.println("Digite 2: Para exibir lista de funcionários.");
            System.out.println("Digite 3: Para Excluir o cadastro de funcionário.");
            System.out.println("Digite 4: Para encerrar interação com o programa.");
            int selecionar = 0;


            System.out.println("Digite a opção desejada:");
            selecionar = leitor.nextInt();
            leitor.nextLine();

            switch (selecionar) {
                case 1:
                    //Cadastrar um funcionário
                    System.out.println("Digite o nome completo do funcionário: ");
                    String nome = leitor.nextLine();
                    System.out.println("Digite o telefone do funcionário: ");
                    String telefone = leitor.nextLine();
                    System.out.println("Digite o e-mail do funcionário: ");
                    String email = leitor.nextLine();
                    System.out.println("Digite o CPF do funcionário: ");
                    String cpf = leitor.nextLine();

                    //Fazendo cadastro
                    funcionario.put(cpf, " - Nome: " + nome + "- E-mail: " + email + " - Telefone: " + telefone);


                    System.out.println("Digite 1 para voltar ao Menu inicial e 0 para finalizar.");
                    retorno = leitor.nextInt();

                    break;

                case 2:
                    //Listando funcionário cadastrados
                   if (funcionario.isEmpty()) {
                       System.out.print("Lista Vazia, retorne ao Menu e Cadastre um funcionário."); //Sinaliza lista vazia .isEmpty

                   }else {
                       for (String chaveFuncionario : funcionario.keySet()) {
                           System.out.println(funcionario.get(chaveFuncionario) + " CPF: " + chaveFuncionario);//Exibi a lista de funcionarios e seus dados cadastrados.
                       }
                   }
                    System.out.println("Digite 1 para voltar ao Menu inicial e 0 para finalizar!");
                    retorno = leitor.nextInt();
                    break;
                case 3:
                    //Deletando o cadastro de um funcionário usando a chave CPF
                    System.out.println("Digite o CPF do funcionário que deseja excluir os dados: ");
                    cpf = leitor.nextLine();
                    funcionario.remove(cpf);
                    System.out.println("Dados removidosw com sucesso!");

                    System.out.println("Digite 1 para voltar ao Menu inicial e 0 para finalizar!");
                    retorno = leitor.nextInt();
                    break;
                case 4:
                    //Encerrando programa
                    System.out.println("Programa encerrado!");
                    System.exit(0); // Sair do programa usando do System.exit(0)
                    break;

                default:
                    //Mostra mensagem caso seja digitado um numero não relacionado ao Menu.
                    System.out.println("Digite um número válido relacionado no menu acima!");
                    break;
            }


        } while (retorno == 1); //Para retornar ao Menu ou sair caso deseje.
   //retorno igual a 1 portanto, se digitado 1 ele retorna ao menu inicial e se digitado 0 que é != de 1 ele encerra o programa

    }
}
