package servletlifecycle;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/hello")
public class Hello implements Servlet {

	
	
	static {
		System.out.println("Hello Class is loaded");//1 st stage ,server will call all the methods
	}
	
	public Hello() {
		// TODO Auto-generated constructor stub
		System.out.println(" Object for Hello class is created");//2 nd stage
	}
	
	
	public void destroy() {//5 th stage
		// TODO Auto-generated method stub
		System.out.println(" Hello class Destroy method is invoked");
		
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig config) throws ServletException {//3 rd stage
		// TODO Auto-generated method stub
		System.out.println(" Hello class init method is invoked");
		
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {//4th stage
		// TODO Auto-generated method stub
		
		System.out.println(" Hello classservice method is invoked");
		
	}

}
