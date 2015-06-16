package control;

import entity.Correntista;
import entity.Movimentacao;

public class CalculoCorrentista {

	public void  deposito (Correntista c,Movimentacao m){
		m.setCorrentista(c);
		c.adicionar(m);
		c.setSaldo(c.getSaldo()+ m.getDeposito());
	}
	
	public void  retida(Correntista c,Movimentacao m){
		m.setCorrentista(c);
		c.adicionar(m);
		if(c.getSaldo()>= m.getReitada()){
		c.setSaldo(c.getSaldo()-m.getReitada());
		}else{throw new IllegalArgumentException("Saldo insuficinete");}
	}
		
}
