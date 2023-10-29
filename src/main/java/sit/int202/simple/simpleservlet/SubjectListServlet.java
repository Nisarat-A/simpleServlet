package sit.int202.simple.simpleservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sit.int202.simple.simpleservlet.entities.subjects;
import sit.int202.simple.simpleservlet.repositories.SubjectRepository;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "SubjectListServlet", value = "/subjects")
public class SubjectListServlet extends HttpServlet {
    private long startTime ;
    @Override
    public void destroy(){
        System.out.println("Duration of  is" +
                (System.currentTimeMillis()-startTime)+ "mill second ");
    }

    @Override
    public void init() throws ServletException {
        startTime = System.currentTimeMillis();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        SubjectRepository sr = new SubjectRepository();
        List<subjects> subjectsList = sr.findAll();
        request.setAttribute("subject", subjectsList); //ของเราเอาใส่เองในrequest
        request.getRequestDispatcher("/subject_list.jsp").forward(request,response);

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> Subject List :: </h1>");
        out.println("<table>");
        out.println("<tr>");
        out.println("<td>Subject Id</td><td>Subject Title</td<td>Credit</td>");
        for(subjects subject : sr.findAll()){
            out.println("<tr>");
            out.println("<td>" + subject.getId() +"</td>");
            out.println("<td>" + subject.getTitle() +"</td>");
            out.println("<td>" + subject.getCredit() +"</td>");
        }
        out.println("</table>");
        out.println("</body></html>");
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
 
