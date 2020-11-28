package Classes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Servico {
    private List<ContaBancaria> contasArray;
    private List<ContaBancaria> contasLinked;
    private List<ContaBancaria> contasVector;
    private static int numeroConta;


    public Servico() {
        this.contasArray = new ArrayList();
        this.contasLinked = new LinkedList();
        this.contasVector = new Vector();
    }

    public int criarConta(String titular, String tel, Double saldo){
        numeroConta++;
        ContaBancaria conta = new ContaBancaria(numeroConta, titular, tel, saldo);
        contasArray.add(conta);
        contasLinked.add(conta);
        contasVector.add(conta);

        return conta.getNumeroConta();
    }

    public String getContaArray(int numeroConta) {
        if(contasArray.size()>=numeroConta){
            return contasArray.get(numeroConta-1).toString();
        }
        return "Conta nao localizada. Verifique o numero da conta.";
    }

    public String getContaLinked(int numeroConta) {
        if(contasLinked.size()>=numeroConta){
            return contasLinked.get(numeroConta-1).toString();
        }
        return "Conta nao localizada. Verifique o numero da conta.";
    }

    public String getContaVector(int numeroConta) {
        if(contasVector.size()>=numeroConta){
            return contasVector.get(numeroConta-1).toString();
        }
        return "Conta nao localizada. Verifique o numero da conta.";
    }

    public void listaTudoArray() {
        for (ContaBancaria c : contasArray){
            System.out.println(c);
        }
    }

    public void listaTudoLinked() {
        for (ContaBancaria c : contasLinked){
            System.out.println(c);
        }
    }

    public void listaTudoVector() {
        for (ContaBancaria c : contasVector){
            System.out.println(c);
        }
    }

    public String alteraNomeArray(int numero, String nome) {
        if(contasArray.size()>=numero){
            ContaBancaria conta = contasArray.get(numero-1);
            conta.setNomeTitular(nome);
            contasArray.set(numero-1,conta);
            return conta.toString();
        }
        return "Conta nao localizada. Verifique o numero da conta.";
    }

    public String alteraNomeLinked(int numero, String nome) {
        if(contasLinked.size()>=numero){
            ContaBancaria conta = contasLinked.get(numero-1);
            conta.setNomeTitular(nome);
            contasLinked.set(numero-1,conta);
            return conta.toString();
        }
        return "Conta nao localizada. Verifique o numero da conta.";
    }

    public String alteraNomeVector(int numero, String nome) {
        if(contasVector.size()>=numero){
            ContaBancaria conta = contasVector.get(numero-1);
            conta.setNomeTitular(nome);
            contasVector.set(numero-1,conta);
            return conta.toString();
        }
        return "Conta nao localizada. Verifique o numero da conta.";
    }

    public String excluirContaArray(int numero) {
        if(contasArray.size()>=numero){
            contasArray.remove(numero-1);
            return "Conta removida com sucesso!";
        }
        return "Conta nao localizada. Verifique o numero da conta.";
    }

    public String excluirContaLinked(int numero) {
        if(contasLinked.size()>=numero){
            contasLinked.remove(numero-1);
            return "Conta removida com sucesso!";
        }
        return "Conta nao localizada. Verifique o numero da conta.";
    }

    public String excluirContaVector(int numero) {
        if(contasVector.size()>=numero){
            contasVector.remove(numero-1);
            return "Conta removida com sucesso!";
        }
        return "Conta nao localizada. Verifique o numero da conta.";
    }
}
