package sec06.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class initParamServlet
 */
@WebServlet(
		urlPatterns = { "/sInit", "/sInit2" }, 
		initParams = {@WebInitParam(name = "email", value = "admin@jweb.com"), 
				@WebInitParam(name = "tell", value = "010-1111-2222")})
public class initParamServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType( "text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String email = getInitParameter("email");
		String tel = getInitParameter("tell");
		out.print("<html><body>");
		out.print("<table><tr>");
		out.print("<td>eamil: </td><td>"+email+"</td></tr>");
		out.print("<tr><td>휴대전화: </td><td>"+tel+"</td>");
		out.print("</tr></table></body></html>");
	}

}
