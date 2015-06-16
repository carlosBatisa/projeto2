package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.CorrentistaDao;
import entity.Correntista;

/**
 * Servlet implementation class Controle
 */
@WebServlet("/Controle")
public class Controle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Chegou ao post.");
		
		String cmd= request.getParameter("cmd");
		if(cmd.equalsIgnoreCase("gravar")){
			gravar(request,response);
			
		}else if(cmd.equalsIgnoreCase("logar")){
			logar(request,response);
			
		}
		
		
	}
	protected void gravar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			Correntista c = new Correntista();
						c.setNumero(new Integer(request.getParameter("numero")));
						c.setNome(request.getParameter("nome"));
						c.setEmail(request.getParameter("email"));
						c.setSaldo(new Double(request.getParameter("saldo")));
						int chave = new CorrentistaDao().create(c);
						request.setAttribute("msg", "Dados Gravado.....");
						request.setAttribute("correntista", c);
						
		}catch(Exception e){
			
			request.setAttribute("msg", "Erro:" +e.getMessage());
				
		}finally{request.getRequestDispatcher("index.jsp").forward(request, response);}
	}
	
	protected void logar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Chegou ao logar.");
		Correntista c = null;
	try{
		c = new Correntista();
		c.setNumero(new Integer(request.getParameter("numero")));
		c.setEmail(request.getParameter("email"));
		Correntista resp = new CorrentistaDao().login(c);
		
		if(resp!= null){
			request.setAttribute("correntista",resp);
			request.setAttribute("msg", "Usuario Logado");
			request.getRequestDispatcher("Logar.jsp").forward(request, response);;
		}
	}catch(Exception e){
	request.setAttribute("msg", "Erro:"+e.getMessage());
	request.getRequestDispatcher("Logar.jsp").forward(request, response);;
	}
		
	}
}
