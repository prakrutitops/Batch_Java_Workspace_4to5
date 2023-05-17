<%@ page import="java.sql.*" %>  
    <%  
    String name=request.getParameter("val");  
    if(name==null||name.trim().equals(""))
    {  
    	out.print("<p>Please enter Email!</p>");  
    }
    else
    {  
    	try
    	{  
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jspproject1","root","");  
    		PreparedStatement ps=con.prepareStatement("select * from signup where email=?");  
    		ps.setString(1, name);
    		ResultSet rs=ps.executeQuery();  
      		if(rs.next()) 
      		{      
     			out.println("<p>Email Id Already Used Sorry you can't use again</p>");   
    		}
      		else
      		{  
    			out.println("<p>Success This Email Id Is Available For USe </p>"); 
    		}  
    		con.close();  
    	}
    	catch(Exception e)
    	{
    		out.print(e);
    	}  
    }  
    %>  