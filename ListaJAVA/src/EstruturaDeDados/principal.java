package EstruturaDeDados;

import java.util.*;

import Classes.ContaBancaria;
import Classes.Menu;

public class principal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Menu menu = new Menu();
		System.out.println("| PROGRAMA CONTA BANCÁRIA ");
		String opcao = menu.exibeMenuPrincipal();

		while (!opcao.equals("0")) {
			switch (opcao) {
				case "0": menu.sair();
					break;
				case "1": menu.exibeCadastraConta();
					break;

				case "2": menu.exibeConta();
					break;

				case "3": menu.listartudo();
					break;

				case "4": menu.alterarConta();
					break;

				case "5": menu.excluirConta();
					break;
				default:
					System.out.println("Opcao Invalida");
					break;
			}
			if(!opcao.equals("0")){
				opcao = menu.exibeMenuPrincipal();
			}
		}
	}
}
