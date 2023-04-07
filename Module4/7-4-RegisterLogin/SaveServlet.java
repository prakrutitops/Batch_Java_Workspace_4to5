import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		String repass = req.getParameter("re_pass");
		
		if(pass.equals(repass))
		{
			Model m =new Model();
			m.setName(name);
			m.setEmail(email);
			m.setPass(pass);
			m.setRepass(repass);
			
			int status = Dao.register(m);
			
			if(status>0)
			{
				resp.sendRedirect("signin.html");
				//out.print("Success");
			}
			else
			{
				out.print("Fail");
			}
			

		}
		else
		{
			out.print("Password does not match with confirm password");
		}
		
	
		
		
	}
}
