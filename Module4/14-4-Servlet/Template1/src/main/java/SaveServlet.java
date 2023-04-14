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
		String phone = req.getParameter("phone");
		String gender = req.getParameter("gender");
		String element = req.getParameter("element");
		String message = req.getParameter("message");
		
		Model m =new Model();
		m.setName(name);
		m.setEmail(email);
		m.setPhone(phone);
		m.setGender(gender);
		m.setElement(element);
		m.setMessage(message);
		
		int status = Dao.savedata(m);
		
		if(status>0)
		{
			out.print("Success");
			//resp.sendRedirect("ViewServlet");
		}
		else
		{
			out.print("Fail");
			//resp.sendRedirect("error.html");
		}
		
		
		
	}
}
