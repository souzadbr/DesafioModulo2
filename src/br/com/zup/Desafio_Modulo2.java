package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio_Modulo2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Map<String, String> funcionario = new HashMap<String,String>();

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
        funcionario.put(cpf," - Nome: "+ nome + "- E-mail: "+email + " - Telefone: "+telefone);
        System.out.println("A lista de funcionários cadastrado é: "+ funcionario);


    }
}
