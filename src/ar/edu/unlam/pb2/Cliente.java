package ar.edu.unlam.pb2;

public class Cliente {
	private Double dineroInicial;
	private Double dineroQueSale;
	private Double dineroQueIngresa;
	private Double dineroTotal;
	private Cuenta cuentas[];
	
	public Cliente(Double dineroInicial) {
		 this.dineroInicial=dineroInicial;
		 this.dineroTotal=dineroInicial;
		 this.dineroQueIngresa=0.0;
		 this.dineroQueSale=0.0;
		 cuentas = new Cuenta[5000];
	}

	public Double getDineroInicial() {
		return dineroInicial;
	}

	public void setDineroInicial(Double dineroInicial) {
		this.dineroInicial = dineroInicial;
	}

	public Double getDineroQueSale() {
		return dineroQueSale;
	}

	public void setDineroQueSale(Double dineroQueSale) {
		this.dineroQueSale = dineroQueSale;
	}

	public Double getDineroQueIngresa() {
		return dineroQueIngresa;
	}

	public void setDineroQueIngresa(Double dineroQueIngresa) {
		this.dineroQueIngresa = dineroQueIngresa;
	}

	public Double getDineroTotal() {
		return dineroTotal;
	}

	public void setDineroTotal(TipoDeTransaccion transaccion, Double monto) {
		if(transaccion.equals(TipoDeTransaccion.DEPOSITO_DINERO)) {
			dineroTotal+=monto;
		}else {
			dineroTotal-=monto;
		}
	}

	
	
}
