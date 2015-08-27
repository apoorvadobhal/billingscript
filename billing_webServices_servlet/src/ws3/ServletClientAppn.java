package ws3;

import java.io.IOException;

//import java.io.PrintWriter;
import java.net.URL;





import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import ws3.HelloWorld;

/**
 * Servlet implementation class ServletClientAppn
 */
@WebServlet("/ServletClientAppn")
public class ServletClientAppn extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		URL url=new URL("http://192.168.0.96:1002/ws3/greet");
		QName qname=new QName("http://ws3/","HelloWorldImplService");
		Service service=Service.create(url, qname);
		double amount=Double.parseDouble(request.getParameter("amt"));
		double discount=Double.parseDouble(request.getParameter("disc"));
		HelloWorld world=service.getPort(HelloWorld.class);
		//PrintWriter pw=response.getWriter();
		double res_amount=world.discountCalc(amount,discount);
		//pw.println("amount reduced is:"+res_amount+"/-");
		//pw.println(discount+"% discount on Rs."+amount+" is "+world.discountCalc(amount,discount));
		System.out.println(res_amount);
		request.setAttribute("disc_amnt",res_amount);
		System.out.println(res_amount);	
		RequestDispatcher rd=request.getRequestDispatcher("/OutScreen.jsp");
		System.out.println(res_amount);
		rd.forward(request, response);
		
	}

}
