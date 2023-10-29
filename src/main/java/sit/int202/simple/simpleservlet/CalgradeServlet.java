package sit.int202.simple.simpleservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalgradeServlet", value = "/grade")
public class CalgradeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //ข้อมูลclient แบบ requestParameter
        // ใช้ method get getParameter
        int score = Integer.valueOf(request.getParameter("score"));  //รับจากเว็บเป็น string เราแปลงใช้ valueof
        //controller เรียก model
        calGrade cg = new calGrade(score);
        //แสดงผล ลอกมา
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1><h1>");
        out.println("<h1> Your Score" + cg.getScore() + "</h1>");
        String color = "pink" ;
        if (cg.getGrade().equalsIgnoreCase("F")){color = "red";};
        out.println("<h3 style='color:"+color+";'> Grade : " + cg.getGrade() + "</h3>");

        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
 
