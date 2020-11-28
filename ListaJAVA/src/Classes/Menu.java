package Classes;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class Menu {
    private Servico servico;

    public Menu() {
        this.servico = new Servico();
    }

    public String exibeMenuPrincipal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n[    MENU PRINCIPAL     ]");
        System.out.print("\n| ESCOLHA UMA OPCAO:");
        System.out.print("\n1 - CADASTRAR DE CONTA");
        System.out.print("\n2 - EXIBIR CONTA");
        System.out.print("\n3 - LISTAR TODAS AS CONTA");
        System.out.print("\n4 - ALTERAR CONTA");
        System.out.print("\n5 - EXCLUIR CONTA");
        System.out.print("\n0 - SAIR\n");
        System.out.print("--> ");
        return sc.nextLine();
    }

    public void exibeCadastraConta(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n-------------------------------------");
        System.out.println("[    CADASTRO DE CONTA     ]");

        System.out.print("\n| INFORME O NOME DO TITULAR: ");
        String nomeTitular = sc.nextLine();

        System.out.print("| INFORME O NÚMERO DE TELEFONE DO TITULAR: ");
        String numeroTelefone = sc.nextLine();

        System.out.print("| INFORME O SALDO INICIAL DA CONTA: ");
        double saldo = sc.nextDouble();

        int numeroConta = servico.criarConta(nomeTitular,numeroTelefone,saldo);
        System.out.print("\nConta cadastrada com Sucesso! NUMERO DA CONTA: " + numeroConta);
        System.out.println("\n-------------------------------------");
    }

    public void exibeConta(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n-------------------------------------");
        System.out.println("[    EXIBIR CONTA     ]");

        System.out.print("\n| INFORME O NUMERO DA CONTA: ");
        String numero = sc.nextLine();

        System.out.println("[    INFORMAÇÕES ATUAIS DA CONTA     ]");
        System.out.println("\n--ArrayList" + servico.getContaArray(Integer.parseInt(numero)));
        System.out.println("\n--LinkedList" + servico.getContaLinked(Integer.parseInt(numero)));
        System.out.println("\n--Vector" + servico.getContaVector(Integer.parseInt(numero)));
        System.out.println("\n-------------------------------------");

    }

    public void listartudo() {
        System.out.println("[    TODAS AS CONTAS     ]");
        System.out.println("\n--ArrayList");
        servico.listaTudoArray();

        System.out.println("\n--LinkedList");
        servico.listaTudoLinked();

        System.out.println("\n--Vector");
        servico.listaTudoVector();
        System.out.println("\n-------------------------------------");
    }

    public void alterarConta() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n-------------------------------------");
        System.out.println("[    ALTERAR TITULAR DA CONTA     ]");

        System.out.print("\n| INFORME O NUMERO DA CONTA: ");
        String numero = sc.nextLine();
        System.out.print("\n| INFORME O NOVO NOME DO TITULAR: ");
        String nome = sc.nextLine();

        System.out.println("[    INFORMAÇÕES ATUALIZADAS     ]");
        System.out.println("\n--ArrayList" + servico.alteraNomeArray(Integer.parseInt(numero), nome));
        System.out.println("\n--LinkedList" + servico.alteraNomeLinked(Integer.parseInt(numero), nome));
        System.out.println("\n--Vector" + servico.alteraNomeVector(Integer.parseInt(numero), nome));

        System.out.println("\n-------------------------------------");

    }

    public void excluirConta() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n-------------------------------------");
        System.out.println("[    EXCLUIR CONTA     ]");

        System.out.print("\n| INFORME O NUMERO DA CONTA: ");
        String numero = sc.nextLine();

        System.out.println("\n--ArrayList");
        System.out.println(servico.excluirContaArray(Integer.parseInt(numero)));

        System.out.println("\n--LinkedList");
        System.out.println(servico.excluirContaLinked(Integer.parseInt(numero)));

        System.out.println("\n--Vector");
        System.out.println(servico.excluirContaVector(Integer.parseInt(numero)));
        System.out.println("\n-------------------------------------");

    }

    public void sair() {
        System.out.println("\n-------------------------------------");
        System.out.println("[    ENCERRANDO O SISTEMA     ]");
        System.out.println("tchau!");
    }
}
