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
            System.out.println("Digite 1: Para cadastrar funcionários");
            System.out.println("Digite 2: Para exibir lista de funcionários");
            System.out.println("Digite 3: Para encerrar interação com o programa");
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


                    System.out.println("Digite 1 para voltar ao Menu inicial e 0 para finalizar");
                    retorno = leitor.nextInt();

                    break;

                case 2:
                    //Listando funcionário cadastrados
                    for (String chaveFuncionario : funcionario.keySet()) {
                        System.out.println(funcionario.get(chaveFuncionario) + " CPF: " + chaveFuncionario);
                    }
                    break;

                case 3:
                    System.out.println("Programa encerrado!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Digite um número válido relacionado no menu acima!");
                    break;
            }


        } while (retorno == 1); //Para retornar ao Menu ou sair caso deseje.


    }
}
