package de.fhws.app.showcase.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("redirect")
public class RedirectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.sendRedirect("/FirstServlet"); //<-- will not work. '/' refers to URL root
        resp.sendRedirect("FirstServlet");
        
        //resp.sendRedirect("http://www.google.de");
    }
    
    
}
