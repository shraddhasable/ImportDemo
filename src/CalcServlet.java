

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import junit.framework.Test;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	public String n1,n2;
	private static final long serialVersionUID = 1L;
	Method m=new Method();
	String op="";

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter();
		
		//PrintWriter out = response.getWriter();
		
       
     
       
        
       
}

	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		double result=0.0;
		PrintWriter out = response.getWriter();
		int number1=Integer.parseInt(request.getParameter("txt1"));
		int number2=Integer.parseInt(request.getParameter("txt2"));
		String operator=request.getParameter("op");
		switch (operator) {
		case "Addition":
			result=m.addition(number1, number2);
			break;
		case "Subtraction":
			result=m.subtraction(number1, number2);
			break;
		case "multiplication":
		result=m.multiply(number1, number2);
		break;
		case "division":
			result=m.division(number1, number2);
			break;
		default:
			break;
		}
		//doGet(request, response);
	       // if(op=="addition")
	       // request.setAttribute(name, o);
		out.println("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>Insert title here</title>\r\n" + 
				"</head>\r\n" + 
				"\r\n" + 
				"<body>\r\n" + 
				"        <form action=\"CalcServlet\" method=\"post\" name=\"frm\">\r\n" + 
				"        \r\n" + 
				"               Enter num1:\r\n" + 
				"               <input name=\"txt1\" type=\"text\" />\r\n" + 
				"            \r\n" + 
				"\r\n" + 
				"                Enter num2:\r\n" + 
				"               <input name=\"txt2\" type=\"text\" />\r\n" + 
				"            \r\n" + 
				"           \r\n" + 
				"               Operator\r\n" + 
				"                \r\n" + 
				"                <select name=\"op\">\r\n" + 
				"                   \r\n" + 
				"                    <option value=\"Addition\">Addition</option>\r\n" + 
				"                    <option value=\"Subtraction\">Subtraction</option>\r\n" + 
				"                    <option value=\"multiplication\">multiplication</option>\r\n" + 
				"                    <option value=\"division\">division</option>\r\n" + 
				"                </select>\r\n" + 
				"            \r\n" + 
				"\r\n" + 
				"                <input type=\"submit\" value=\"submit\" />\r\n" + 
				          "        </form>\r\n" + 
				"    \r\n" + 
				"</body>\r\n" + 
				"</html>");
		out.println("result="+result);
	}

}
