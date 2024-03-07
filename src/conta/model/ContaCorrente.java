package conta.model;

// ContaCorrente herda da conta
public class ContaCorrente extends Conta {

	private float limite;

	public ContaCorrente(int numeroConta, int agencia, int tipo, String titular, float saldo, float limite) {
		
		// metodo const da super classe
		// conta(numeroConta, agencia, tipo, titular, saldo)
		super(numeroConta, agencia, tipo, titular, saldo);
		 
		// atributo da classe
		this.limite = limite;
		
	}

	// método de acesso
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	//metodos especificos
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Limite de crédito:" + this.limite);
	}


}
