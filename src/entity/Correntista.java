package entity;

import java.util.ArrayList;
import java.util.List;

public class Correntista {
	
	private Integer numero;
	private String nome;
	private String email;
	private Double saldo=0.;
	
	private List<Movimentacao> movimentacoes;



	public Correntista() {
		super();
	}

	public Correntista(Integer numero, String nome, String email, Double saldo) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.email = email;
		this.saldo = saldo;
	}

	public Correntista(Integer numero, String nome, String email,
			Double saldo, List<Movimentacao> movimentacoes) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.email = email;
		this.saldo = saldo;
		this.movimentacoes = movimentacoes;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Movimentacao> getMovimentacoes() {
		return movimentacoes;
	}

	public void setMovimentacoes(List<Movimentacao> movimentacoes) {
		this.movimentacoes = movimentacoes;
	}
	public void adicionar(Movimentacao m){
		if(m == null){
			movimentacoes = new ArrayList<Movimentacao>();
		}
		movimentacoes.add(m);
	}
	@Override
	public String toString() {
		return "Correntista [numero=" + numero + ", nome=" + nome + ", email="
				+ email + ", saldo=" + saldo + ", movimentacoes="
				+ movimentacoes + "]";
	}


	
	
}
