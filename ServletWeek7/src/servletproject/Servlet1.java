package servletproject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * dopost called by server by the request method
 * this allows the servlet to handle the post request
 * tjis also allows the servlet to handle the put request
 */
@WebServlet(name = "Servlet", urlPatterns={"/Servlet"})
public class Servlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<html><head></head><body>");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String telephone = request.getParameter("telephone");
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        out.println("<h1>First contact with tomcat </h1>");
        out.println("<p>name: " + name + "</p>");
        out.println("<p>address: " + address + "</p>");
        out.println("<p>telephone: " + telephone + "</p>");
        out.println("<p>login: " + login + "</p>");
        out.println("<p>password: " + password + "</p>");
        out.println("</body></html>");
    }

    /**
     *
     * @param request a url from the HTML form
     * @param response gets the response of the form
     * @throws ServletException
     * @throws IOException
     */
        protected void doGet (HttpServletRequest request, HttpServletResponse response) throws
        ServletException, IOException {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("This resource is not available directly");
        }

    }
