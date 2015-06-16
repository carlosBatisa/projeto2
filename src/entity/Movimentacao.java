package entity;

import java.sql.Timestamp;



public class Movimentacao {
	private Integer idMovimentacao;
	private Double deposito=0.;
	private Double reitada=0.;
	private Timestamp dataMovimentacao;
	
	private Correntista correntista;

	

	public Movimentacao(Integer idMovimentacao, Double deposito,
			Double reitada, Timestamp dataMovimentacao, Correntista correntista) {
		super();
		this.idMovimentacao = idMovimentacao;
		this.deposito = deposito;
		this.reitada = reitada;
		this.dataMovimentacao = dataMovimentacao;
		this.correntista = correntista;
	}

	public Movimentacao() {
		super();
	}
	
	

	public Integer getIdMovimentacao() {
		return idMovimentacao;
	}

	public void setIdMovimentacao(Integer idMovimentacao) {
		this.idMovimentacao = idMovimentacao;
	}

	public Double getDeposito() {
		return deposito;
	}

	public void setDeposito(Double deposito) {
		this.deposito = deposito;
	}

	public Double getReitada() {
		return reitada;
	}

	public void setReitada(Double reitada) {
		this.reitada = reitada;
	}

	public Timestamp getDataMovimentacao() {
		return dataMovimentacao;
	}

	public void setDataMovimentacao(Timestamp dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}

	public Correntista getCorrentista() {
		return correntista;
	}

	public void setCorrentista(Correntista correntista) {
		this.correntista = correntista;
	}

	@Override
	public String toString() {
		return "Movimentacao [idMovimentacao=" + idMovimentacao + ", deposito="
				+ deposito + ", reitada=" + reitada + ", dataMovimentacao="
				+ dataMovimentacao + ", correntista=" + correntista + "]";
	}
	
	
	
}
