package persistence;

import entity.Correntista;

public class CorrentistaDao extends Dao{
	
	public Integer create(Correntista c)throws Exception{
		
		open();
		stmt = con.
				prepareStatement("insert into correntista values(?,?,?,?)");
		stmt.setInt(1,c.getNumero());
		stmt.setString(2, c.getNome());
		stmt.setString(3, c.getEmail());
		stmt.setDouble(4, c.getSaldo());
		stmt.execute();
		stmt.close();
		close();
		
		return c.getNumero();
	}
	
	public void update(Correntista c,int chave)throws Exception{
		
		open();
		stmt = con.
				prepareStatement("update correntista set nome=?,email=?,saldo=? where numero=?");
		
		stmt.setString(1, c.getNome());
		stmt.setString(2, c.getEmail());
		stmt.setDouble(3, c.getSaldo());
		stmt.setInt(4,chave);
		stmt.execute();
		stmt.close();
		close();
		
		
	}
	
	
}
