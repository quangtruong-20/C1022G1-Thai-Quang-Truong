import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", value = "/calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        double n1 = Double.parseDouble(request.getParameter("n1"));
        double n2 = Double.parseDouble(request.getParameter("n2"));
        String operator = request.getParameter("operator");

        double result = 0;

        try{
            result = Calculator.calculate(n1,operator,n2);
            request.setAttribute("result",result);

        }catch (
                NumberFormatException e){
            e.printStackTrace();
        }
        request.getRequestDispatcher("/result.jsp").forward(request,response);
    }
}
