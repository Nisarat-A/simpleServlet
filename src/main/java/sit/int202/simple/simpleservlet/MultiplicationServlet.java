package sit.int202.simple.simpleservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "MultiplicationServlet", value = "/MultiplicationServlet")
public class MultiplicationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String number = request.getParameter("number");
        if (number == null || number.length() == 0 || !isNumber(number)) {
            request.setAttribute("message", "Invalid or null parameter");
        }
        request.getRequestDispatcher("/multiplication_table.jsp").forward(request, response);
    }


    private boolean isNumber(String numberstr) {
        for (int i = 0; i < numberstr.length(); i++) {
            if (!Character.isDigit(numberstr.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
 
