package sit.int202.simple.simpleservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet(name = "favoriteSubject", value = "/favoriteSubject")
public class FavoriteSubject extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String subject[] = request.getParameterValues("subject"); //array หลายค่า values
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> Your favorite subject :: </h1>");
        out.println("<h3> your id is " + id + "</h3>");
        out.println("<h3> your name is " + name + "</h3>");
        out.println(" your favorite subject : <br> ");
        for (String st:subject
             ) {
            out.print("&nbsp; &nbsp; -"+st+"<br>");
        }
        out.println("<hr>");
        out.println("<h3>Request parameter using getParameter() ::</h3></hr>");
        Map<String,String[]> map = request.getParameterMap();
        out.println("<h3> Your favorite subject :: </h3>");
        out.println("<h3> your id is " + map.get("id")[0] + "</h3>");
        out.println("<h3> your name is " + map.get("name")[0] + "</h3>");
        out.println(" your favorite subject : <br> ");
        for (String st:subject
        ) {
            out.print("&nbsp; &nbsp; -"+st+"<br>");
        }
        out.println("<hr>");

        out.println("<a href='favorite_subject.html'>back</a>");
        out.println("</body></html>");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
 
