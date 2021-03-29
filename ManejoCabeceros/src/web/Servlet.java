package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;

@WebServlet("/ServletHeaders")
public class Servlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response ) throws IOException{
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String metodoHttp = request.getMethod();//Método para obtener el método solicitado
		String uri = request.getRequestURI();//Método para obtener la URI del recurso
		String nombrePath = request.getContextPath();//Método para obtener el nombre del proyecto
		String direccionLocal = request.getLocalAddr();//Metodo para obtener la dirección local
		String protocolo = request.getProtocol();//Método para devolver el protocolo que se está usando
		Enumeration cabeceros = request.getHeaderNames();//Método para imprimir todos los cabeceros disponibles
		
		
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Header HTTP</title>");
		out.print("<body>");
		
		out.print("<h1>Headers HTTP</h1>");
		out.print("<br>");
		
		out.print("Método Http: " + metodoHttp);
		out.print("<br>");
		
		out.print("Uri solicitada: " + uri);
		out.print("<br>");
		
		out.print("Nombre del Path: " + nombrePath);
		out.print("<br>");
		
		out.print("Dirección Local: " + direccionLocal);
		out.print("<br>");
		
		out.print("Protocolo: " + protocolo);
		out.print("<br>");
		
		out.print("<br>");
		out.print("<br>");
		while (cabeceros.hasMoreElements()) {
			String nombreCabecero =  (String)cabeceros.nextElement();
			out.print("<b>" + nombreCabecero + "</b>: ");
			out.print(request.getHeader(nombreCabecero));
			out.print("<br>");
		}
		
		out.print("</body>");
		out.print("</head>");
		out.print("</html>");
		out.close();
	}
}
