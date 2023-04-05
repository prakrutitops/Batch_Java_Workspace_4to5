import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String address = req.getParameter("address");
		String phone = req.getParameter("phone");
		
		Model m =new Model();
		m.setName(name);
		m.setEmail(email);
		m.setAddress(address);
		m.setPhone(phone);
		
		int status = Dao.savedata(m);
		
		if(status>0)
		{
			//out.print("Success");
			resp.sendRedirect("ViewServlet");
		}
		else
		{
			//out.print("Fail");
			resp.sendRedirect("error.html");
		}
		
		
		
	}
}
