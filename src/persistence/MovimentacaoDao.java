package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Correntista;
import entity.Movimentacao;

public class MovimentacaoDao extends Dao {
	
	public void create(Movimentacao m)throws Exception{
		open();
		
		stmt = con.prepareStatement("insert into movimentacao values(null,?,?,now(),?)");
		stmt.setDouble(1, m.getDeposito());
		stmt.setDouble(2, m.getReitada());
		stmt.setInt(3, m.getCorrentista().getNumero());
		stmt.execute();
		stmt.close();
		close();
	}
	
	public static void main(String[] args) {
		Correntista c = new Correntista(106, "sergio", "sergio@hotmail.com5", 4000.);
		List<Movimentacao> lista = new ArrayList<Movimentacao>();
		try{
			Movimentacao m1 = new Movimentacao(null, 1000., 0., null, c);
						 m1.setCorrentista(c);			
						 c.setSaldo(c.getSaldo()+m1.getDeposito());
			
			Movimentacao m2 = new Movimentacao(null, 1000., 0., null, c);
						 m2.setCorrentista(c);			
						 c.setSaldo(c.getSaldo()+m1.getDeposito());
						 lista.add(m1);
						 lista.add(m2);
			int chave = new CorrentistaDao().create(c);
			MovimentacaoDao md = new MovimentacaoDao();
			for(Movimentacao m: lista){
				md.create(m);
			}
			new CorrentistaDao().update(c, chave);
			System.out.println("dados gravado...");
			
		}catch(Exception e){
			System.out.println("ERRO: "+ e.getMessage());
			
		}
	}
	
}
