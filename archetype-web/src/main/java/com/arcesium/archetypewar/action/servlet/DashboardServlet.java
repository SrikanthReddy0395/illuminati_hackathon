
package com.arcesium.archetypewar.action.servlet;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class DashboardServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");// setting the content type

        // get the stream to write the data
        try (PrintWriter pw = res.getWriter()) {

            // writing html in the stream
            pw.println("<html><body>");
            pw.println("Welcome to servlet");
            pw.println("</body></html>");
        }
    }
}