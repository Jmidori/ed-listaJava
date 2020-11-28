package Classes;

public class ContaBancaria {

	private int numeroConta;
	private String nomeTitular;
	private String numeroTelefone;
	private Double saldo;
	
	public ContaBancaria(int numeroConta, String nomeTitular, String numeroTelefone, double saldo2) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.numeroTelefone = numeroTelefone;
		this.saldo = saldo2;
	}

	public int getNumeroConta() { return numeroConta;}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public String getNumeroTelefone() {
		return numeroTelefone;
	}
	
	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	
	public Double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "\n NUMERO CONTA       --> " + numeroConta
				+ "\n NOME DO TITULAR    --> " + nomeTitular
				+ "\n N?MERO DO TELEFONE --> " + numeroTelefone 
				+ "\n SALDO              --> " + String.format("%.2f", saldo);
		
	}
	
	
	
}
